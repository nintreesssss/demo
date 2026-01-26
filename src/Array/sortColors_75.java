//LeetCode 75:颜色分类
//https://leetcode.cn/problems/sort-colors/description/

package Array;

public class sortColors_75 {
    public void sol(int[] nums){
        int[] counts = new int[3];
        for(int i : nums){
            counts[i]++;
        }

        int index = 0;
        for(int j = 0;j<3;j++){
            for(int x = 0;x<counts[j];x++){
                nums[index] = j;
                index++;
            }
        }
    }
}

//使用了计数排序
