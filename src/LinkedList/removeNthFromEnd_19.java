//LeetCode 19: 删除链表的倒数第N个节点
//https://leetcode.cn/problems/remove-nth-node-from-end-of-list/description/

package LinkedList;

public class removeNthFromEnd_19 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }    
    public ListNode sol(ListNode head,int n){
        ListNode p1 = head;
        for(int i = 0;i<n;i++){
            p1 = p1.next;
        }

        //重要！如果要删除头结点，for循环结束时p1为null，此时while判断条件会报错
        if (p1 == null) {
            return head.next;
        }

        ListNode p2 = head;
        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        p2.next = p2.next.next;

        return head;
    }
}
