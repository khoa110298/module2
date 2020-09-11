package bai3_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
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
            System.out.print("nhập phần tử thứ " + (i +1) + ": ");
            array[i]=scanner.nextInt();
        }
        System.out.print("Elements in array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        int max = array[0];
        int index = 0;
        for (int j=0;j<size;j++){
            if (array[j]>max){
                max = array[j];
                index = j+1;
            }
        }
        System.out.print("giá trị lớn nhất trong mảng là: " + max + "\n" +  "với vị trị là: " + index);
    }
}
