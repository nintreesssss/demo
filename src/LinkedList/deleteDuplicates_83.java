//LeetCode 83:删除排序链表中的重复元素
//https://leetcode.cn/problems/remove-duplicates-from-sorted-list/

package LinkedList;

public class deleteDuplicates_83 {
    public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode sol(ListNode head){
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null) {
            if (slow.val != fast.val) {
                slow = slow.next;
                slow.val = fast.val;
            }
            fast = fast.next;
        }
        slow.next = null;
        return head;
    }
}
