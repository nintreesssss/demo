//LeetCode 5:最长回文子串
//https://leetcode.cn/problems/longest-palindromic-substring/

package String;

public class longestPalindrome_5 {
    public String palindrome(String s,int i,int j){
        while (i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return s.substring(i + 1,j);
    }

    public String sol(String s){
        String res = "";
        for(int i = 0;i<s.length();i++){
            String s1 = palindrome(s, i, i);
            String s2 = palindrome(s, i, i+1);
            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }
        return res;
    }
}
