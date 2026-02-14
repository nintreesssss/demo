//LeetCode 867:转置矩阵
//https://leetcode.cn/problems/transpose-matrix/description/

package Array;

public class transposeMatrix_867 {
    public int[][] sol(int[][] matrix){
        int i = matrix.length;
        int j = matrix[0].length;
        int[][] res = new int[j][i];
        for(int n = 0;n<i;n++){
            for(int m = 0;m<j;m++){
                res[m][n] = matrix[n][m];
            }
        }
        return res;
    }
}
