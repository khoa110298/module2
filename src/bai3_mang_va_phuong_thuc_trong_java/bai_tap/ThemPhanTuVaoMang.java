package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
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
        int[] array1 = new int[size+1];
        array1[size] = 0;
        System.out.println();
        System.out.print("nhập phần tử cần thêm vào mảng: ");
        int X = scanner.nextInt();
        System.out.print("nhập vị trí cần thêm: ");
        int Y = scanner.nextInt();
        for (int i=0; i<=size; i++){
            array1[i] = array[i];
            if (Y==i){
                array1[i]=X;
                for (int j=i; j<size;j++){
                    array1[j+1]=array[j];
                }
                break;
            }
        }
        System.out.println();
        System.out.print("new array: " + Arrays.toString(array1));
    }
}
