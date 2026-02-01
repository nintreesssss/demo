//LeetCode 21:合并两个有序链表
//https://leetcode.cn/problems/merge-two-sorted-lists/

package LinkedList;

public class mergeTwoLists_21 {

    public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode Solution(ListNode list1,ListNode list2){
        ListNode dummy = new ListNode();
        ListNode list = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list.next = list1;
                list = list.next;
                list1 = list1.next;
            }else{
                list.next = list2;
                list = list.next;
                list2 = list2.next;
            }
        }
        if (list1 == null) {
            list.next = list2;
        }else if (list2 == null) {
            list.next = list1;
        }

        return dummy.next;
    }
}

//思路：需要添加哨兵节点来准确返回链表的头部