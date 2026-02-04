//LeetCode 509:斐波那契数
//https://leetcode.cn/problems/fibonacci-number/description/

package Array;

public class fibonacciNumber_509 {
    public int fib(int n){
        if (n == 0 || n == 1) {
            return n;
        }

        int fib1 = 0;
        int fib2 = 1;
        for(int i = 2;i<=n;i++){
            int fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }

        return fib2;
    }
}
