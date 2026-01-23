//LeetCode 225:用队列实现栈
//https://leetcode.cn/problems/implement-stack-using-queues/description/

package Queue;

import java.util.LinkedList;

public class MyStack_225 {
    private LinkedList<Integer> a;

    public MyStack_225(){
        a = new LinkedList<>();
    }

    public boolean empty(){
        return a.isEmpty();
    }

    public void push(int x){
        a.addLast(x);
    }

    public int top(){
        for(int i = 0;i<a.size()-1;i++){
            a.addLast(a.removeFirst());
        }
        int x = a.getFirst();
        a.addLast(a.removeFirst());
        return x;
    }

    public int size(){
        return a.size();
    }

    public int pop(){
        for(int i = 0;i<a.size()-1;i++){
            a.addLast(a.removeFirst());
        }
        int x = a.removeFirst();
        return x;        
    }
}
