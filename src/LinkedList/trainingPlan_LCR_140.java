//LeetCode LCR 140:训练计划II
//https://leetcode.cn/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/description/

package LinkedList;

public class trainingPlan_LCR_140 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
        
    public ListNode sol(ListNode head,int cnt){

        ListNode fast = head;
        ListNode slow = head;

        for(int i = 0;i<cnt;i++){
            fast = fast.next;
        }

        if (fast == null) {
            return head;
        }
        
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow.next;
    }
}
