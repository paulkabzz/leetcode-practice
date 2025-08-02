/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> s = new HashSet<>();
        if (head == null) return false;

        while (head.next != null) {
            head = head.next;

            if (s.contains(head)) {
                return true;
            } else {
                s.add(head);
            }

        }

        return false;
    }
}