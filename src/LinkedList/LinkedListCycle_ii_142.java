//LeetCode 142:环形链表II
//https://leetcode.cn/problems/linked-list-cycle-ii/

package LinkedList;

public class LinkedListCycle_ii_142 {
    class ListNode {
    int val;
        ListNode next;
        ListNode(int x) {
        val = x;
        next = null;
        }
    }

    public ListNode sol(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
