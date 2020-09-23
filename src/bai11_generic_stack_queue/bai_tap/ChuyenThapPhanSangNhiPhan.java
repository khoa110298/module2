package bai11_generic_stack_queue.bai_tap;

import java.util.Scanner;

public class ChuyenThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần chuyển: ");
        int n = scanner.nextInt();
        int a;
        int s=0;
        int i=1;
        while (n>0){
            a = n%2;
            n = n/2;
            s += a*i;
            i=i*10;
        }
        System.out.println(s);
    }
}
