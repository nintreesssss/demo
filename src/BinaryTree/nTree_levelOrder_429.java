//LeetCode 429:N叉树的层序遍历
//https://leetcode.cn/problems/n-ary-tree-level-order-traversal/description/

package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class nTree_levelOrder_429 {
    class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
    }

    public List<List<Integer>> levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> sol = new ArrayList<>();

        if (root == null) {
            return sol;
        }
        q.offer(root);
        
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> current = new ArrayList<>();
            for(int i = 0;i<size;i++){
                Node cur = q.poll();
                current.add(cur.val);
                if(cur.children != null){
                for(Node cd : cur.children){    
                    q.offer(cd);
                }
                }
            }
            sol.add(current);
        }
        return sol;
    }
}
