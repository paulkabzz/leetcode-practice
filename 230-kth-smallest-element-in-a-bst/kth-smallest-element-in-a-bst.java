/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * } 
    Complexity - O(nlogn)
    Space - O(n) extra space

 */
class Solution {

    private void inOrder(TreeNode root, ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;
        if (root == null) return;

        inOrder(root.left, list);
        if (root.val < min) {
            min = root.val;
            list.add(min);
        };
        inOrder(root.right, list);

    }

    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);

        System.out.println(list);

        // for (int i = 0; i < k - 1; i++) {
        //     minHeap.poll();
        // }
        return list.get(k-1);
    }
}