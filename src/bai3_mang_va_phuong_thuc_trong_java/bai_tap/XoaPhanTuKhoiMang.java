package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhập độ dài mảng: ");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("độ dài mảng không lớn hơn 20 ");
            }
        }while (size>20);

        int[] array = new int[size];
        for (int i=0; i<size; i++){
            System.out.print("nhập phần tử thứ " + (i +1) + ": ");
            array[i]=scanner.nextInt();
        }
        System.out.print("Elements in array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.print("nhập phần tử cần xóa: ");
        int X = scanner.nextInt();
        for (int i=0; i<array.length; i++){
            if (array[i]==X){
                for (int j=i; j<array.length-1; j++){
                    array[j] = array[j+1];
                }
                array[array.length-1]=0;
            }
        }
        System.out.print("new array: " + Arrays.toString(array));
    }
}
