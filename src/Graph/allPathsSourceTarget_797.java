//LeetCode 797
//https://leetcode.cn/problems/all-paths-from-source-to-target/

package Graph;

import java.util.LinkedList;
import java.util.List;

public class allPathsSourceTarget_797 {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> Solution(int[][] graph,int s){
        traverse(graph,0);
        return res;
    }

    void traverse(int[][]graph,int s){
        path.add(s);

        if (s == (graph.length-1)) {
            res.add(new LinkedList<>(path));
            path.removeLast();
            return;
        }

        for(int i : graph[s]){
            traverse(graph, i);
        }

        path.removeLast();
    }
}
