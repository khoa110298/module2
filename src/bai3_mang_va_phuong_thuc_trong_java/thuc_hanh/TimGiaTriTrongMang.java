package bai3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.print("nhâp tên học sinh cần kiểm tra: ");
        String input_name = sc.nextLine();
        boolean  check = false;

        for (int i=0; i<students.length; i++){
            if (students[i].equals(input_name)){
                System.out.println("name students: " + input_name +"với số thứ tự là: " + (i +1));
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println(input_name + " không có trong danh sách");
        }
    }
}
