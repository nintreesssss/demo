//LeetCode 378:有序数组中第K小的元素
//https://leetcode.cn/problems/kth-smallest-element-in-a-sorted-matrix/description/

package Array;

import java.util.PriorityQueue;

public class kthSmallest_378 {
    public int sol(int[][] matrix,int k){
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {return a[0] - b[0];});

        for(int i = 0;i<matrix.length;i++){
            pq.offer(new int[]{matrix[i][0],i,0});
        }

        int res = -1;

        while (!pq.isEmpty() && k > 0) {
            int[] cur = pq.poll();
            res = cur[0];
            k--;

            int i =cur[1],j = cur[2];
            if(j < matrix[i].length - 1){
                pq.add(new int[]{matrix[i][j + 1],i,j + 1});
            }
        }
        return res;
    }
}
