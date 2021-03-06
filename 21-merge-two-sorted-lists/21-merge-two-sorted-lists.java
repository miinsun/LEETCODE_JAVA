/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.util.*;
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode firstNode = new ListNode(0);
        ListNode nextNode = firstNode;

        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                nextNode.next = l2;
                l2 = l2.next;
            } else {
                nextNode.next = l1;
                l1 = l1.next;
            }
            nextNode = nextNode.next;
        }

        if (l1 == null) {
            nextNode.next = l2;
        }
        if (l2 == null) {
            nextNode.next = l1;
        }

        return firstNode.next;

    }
}