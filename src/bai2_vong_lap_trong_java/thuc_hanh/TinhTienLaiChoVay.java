package bai2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số tiền cần gửi: ");
        double money = sc.nextDouble();
        System.out.print("nhập số tháng gửi: ");
        int month = sc.nextInt();
        System.out.print("nhập lãi năm: ");
        double interest = sc.nextDouble();
        double total = 0;
        for (int i=0;i<month;i++){
            total +=money*(interest/100)/12*month;
        }
        System.out.println("số tiền lãi là: " + total);
    }
}
