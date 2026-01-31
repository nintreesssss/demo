//LeetCode 167:两数之和II-输入有序数组
//https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/description/

package Array;

public class twoSum_ii_167 {
    public int[] sol(int[] numbers,int target){
        int sol[] = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            if (numbers[left] + numbers[right] == target) {
                //题目要求第x个元素，不能返回索引
                sol[0] = left + 1;
                sol[1] = right + 1;
                break;
            }else if (numbers[left] + numbers[right] > target) {
                right--;
            }else{
                left++;
            }
        }
        return sol;
    }
}
