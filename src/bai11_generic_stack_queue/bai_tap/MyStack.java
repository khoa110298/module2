package bai11_generic_stack_queue.bai_tap;

import java.util.Collections;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

//        Collections.reverse(stack);
//        System.out.println(stack);
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + ",");
        }
//        Stack<Integer> Wstack = new Stack<>();
//        for (int i=0;i<stack.size();i++){
//            int n = stack.size()-1;
//            Wstack.push(stack.get(n-i));
//        }
//        System.out.println(Wstack);
//
    }
}
