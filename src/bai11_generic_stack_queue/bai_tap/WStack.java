package bai11_generic_stack_queue.bai_tap;

import java.util.Stack;

public class WStack {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] arrStr = str.split("");


        Stack<String> mWord = new Stack<>();
        for (int i=0; i<arrStr.length;i++){
            mWord.push(arrStr[i]);
        }
        while (!mWord.isEmpty()){
            System.out.print(mWord.pop()+",");
        }
    }
}
