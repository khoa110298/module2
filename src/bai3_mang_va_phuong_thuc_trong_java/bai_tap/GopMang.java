package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int size1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhập độ dài mảng thứ nhất: ");
            size1 = scanner.nextInt();
            if (size1>20){
                System.out.println("độ dài mảng không lớn hơn 20 ");
            }
        }while (size1>20);

        int[] array1 = new int[size1];
        for (int i=0; i<size1; i++){
            System.out.print("nhập phần tử thứ " + (i +1) + ": ");
            array1[i]=scanner.nextInt();
        }
        System.out.print("Elements in array1: ");
        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] + "\t");
        }
        System.out.println();
        int size2;
        do {
            System.out.print("nhập độ dài mảng thứ 2: ");
            size2 = scanner.nextInt();
            if (size2>20){
                System.out.println("độ dài mảng không lớn hơn 20 ");
            }
        }while (size2>20);
        int[] array2 = new int[size2];
        for (int i=0; i<size2; i++){
            System.out.print("nhập phần tử thứ " + (i +1) + ": ");
            array2[i]=scanner.nextInt();
        }
        System.out.print("Elements in array2: ");
        for (int j = 0; j < array2.length; j++) {
            System.out.print(array2[j] + "\t");
        }
        int[] array3 = new int[size1+size2];
        for (int i=0; i<size1; i++){
            array3[i]=array1[i];
        }
        for (int j=size1; j<size2 +size1; j++){
            array3[j]=array2[j-size1];
        }
        System.out.println();
        System.out.println("Elements in array3: " + Arrays.toString(array3));
    }
}
