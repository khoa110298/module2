package bai11_generic_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần chuyển: ");
        int n = scanner.nextInt();
        Stack<Integer> stack= new Stack<Integer>();
        int a;
        while (n>0){
            a = n%2;
            n = n/2;
            stack.push(a);
        }
      while (!stack.isEmpty()){
          System.out.print(stack.pop());
      }
    }
}
