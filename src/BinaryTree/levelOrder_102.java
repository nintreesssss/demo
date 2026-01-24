//LeetCode 102:二叉树的层序遍历
//https://leetcode.cn/problems/binary-tree-level-order-traversal/

package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder_102 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> Solution(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> sol = new ArrayList<>();

        if (root == null) {
            return sol;
        }
        q.offer(root);
        
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> current = new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode cur = q.poll();
                current.add(cur.val);
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }

            sol.add(current);
        }
        return sol;
    }
}

/*
笔记：Java中将对象加入集合时，存入的是地址的引用，使用clear会将之前存入的
对象也一起清空。如果打算复用同一个变量名来存储不同的数据集，
必须使用 new 关键字重新分配空间，而不是使用 .clear()
*/
