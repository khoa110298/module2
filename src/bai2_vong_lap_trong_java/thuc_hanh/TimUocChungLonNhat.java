package bai2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a: ");
        int a = scanner.nextInt();
        System.out.println("nhập số b: ");
        int b = scanner.nextInt();
         a = Math.abs(a);
         b = Math.abs(b);

         if (a == 0 || b == 0){
             System.out.println("không có ước chung");
         }else {
             while (a != b){
                 if (a > b){
                     a = a - b;
                 }else {
                     b = b - a;
                 }
             }
             System.out.println("UCLL là: " + a);
         }
    }
}
