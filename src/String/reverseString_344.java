//LeetCode 344:反转字符串
//https://leetcode.cn/problems/reverse-string/description/

package String;

public class reverseString_344 {
    public void sol(char[] s){
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;

            left++;
            right--;
        }
    }
}
