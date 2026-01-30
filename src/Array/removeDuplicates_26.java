//LeetCode 26:删除有序数组中的重复项
//https://leetcode.cn/problems/remove-duplicates-from-sorted-array/

package Array;

public class removeDuplicates_26 {
    public int sol(int[] nums){
        if (nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        int slow = 0,fast = 0;
        for(int i = 0;i<len;i++){
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow+1;
    }
}
