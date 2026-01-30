//LeetCode 27:移除元素
//https://leetcode.cn/problems/remove-element/

package Array;

public class removeElement_27 {
    public int sol(int nums[],int val){
        if (nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        int slow = 0,fast = 0;
        for(int i = 0;i<len;i++){
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
