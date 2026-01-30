//LeetCode 160:相交链表
//https://leetcode.cn/problems/intersection-of-two-linked-lists/description/

package LinkedList;

public class GetIntersectionNode_160 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode sol(ListNode headA,ListNode headB){
        ListNode pa = headA;
        ListNode pb = headB;
        while (pa != pb) {
            if (pa != null) {
                pa = pa.next;
            }else pa = headB;

            if (pb != null) {
                pb = pb.next;
            }else pb = headA;
        }
        return pa;
    }
}
