//LeetCode 141:环形链表
//https://leetcode.cn/problems/linked-list-cycle/description/

package LinkedList;

public class LinkedListCycle_i_141 {
    class ListNode {
    int val;
        ListNode next;
        ListNode(int x) {
        val = x;
        next = null;
        }
    }

    public boolean sol(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        boolean sol = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                sol = true;
                break;
            }
        }
        return sol;
    }
}
