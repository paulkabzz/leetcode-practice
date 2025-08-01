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
    Complexity - O(klogn)
    Space - O(n) extra space

 */
class Solution {

    private void inOrder(TreeNode root, PriorityQueue<Integer> minHeap) {
        if (root == null) return;

        inOrder(root.left, minHeap);
        minHeap.offer(root.val);
        inOrder(root.right, minHeap);

    }

    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        inOrder(root, minHeap);

        for (int i = 0; i < k - 1; i++) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
