//LeetCode 283:移动零
//https://leetcode.cn/problems/move-zeroes/description/

package Array;

public class moveZeroes_283 {
    public void sol(int nums[]){
        if (nums.length == 0) {
            return;
        }
        int len = nums.length;
        int slow = 0,fast = 0;
        for(int i = 0;i<len;i++){
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        for(int i = slow;i<nums.length;i++){
            nums[i] = 0;
        }
    }    
}
