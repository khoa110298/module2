package bai3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class DaoNguocCacPhanTuTrongMang {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhập độ dài mảng:");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("độ dài mảng không lớn hơn 20 ");
            }
        }while (size>20);

        int[] array = new int[size];
        for (int i=0; i<size; i++){
            System.out.print("nhập phần tử thứ " + i + ": ");
            array[i]=scanner.nextInt();
        }
        System.out.print("Elements in array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j=0; j<size/2; j++){
            int temp = array[j];
            array[j] = array[size-1-j];
            array[size -1-j] = temp;
        }
        System.out.println();
        System.out.print("reverse array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
