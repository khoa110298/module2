package bai2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số cần kiểm tra: ");
        int number = scanner.nextInt();
        if (number<2){
            System.out.println("đây không phải số nguyên tố");
        }else{
            boolean check = true;
            for (int i = 2; i < number;i++){
                if (number % i ==0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println("đây là số nguyên tố");
            }else {
                System.out.println("đây không phải số nguyên tố");
            }
        }
    }
}
