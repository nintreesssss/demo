//LeetCode 82:删除排序链表中的重复元素 II
//https://leetcode.cn/problems/remove-duplicates-from-sorted-list-ii/description/

package LinkedList;

public class deleteDuplicates_ii_82 {
    public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode sol(ListNode head){
        ListNode dummy1 = new ListNode(-100);
        ListNode dummy2 = new ListNode(-100);
        ListNode p = head;
        ListNode p1 = dummy1;
        ListNode p2 = dummy2;
        
        while (p != null) {
            if (p.next != null && p.val == p.next.val || p.val == p1.val) {
                p1.next = p;
                p1 = p1.next;
            }else{
                p2.next = p;
                p2 = p2.next;
            }

            p = p.next;
            p1.next = null;
            p2.next = null;
        }

        return dummy2.next;
    }
}
