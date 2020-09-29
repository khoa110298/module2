package bai14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class InsertSort {

    public static void insertSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int insert = list[i];
            int j = i - 1;
//            while (j >= 0 && list[j] < insert){
//                list[j + 1] = list[j];
//                j--;
//            }
            for (j = i - 1; j >= 0 && list[j] > insert; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = insert;
            System.out.println(Arrays.toString(list));
        }
    }
    public static void main(String[] args) {
        int[] array = {4, 2, 9, 3, 11, 1};
        System.out.println(Arrays.toString(array));
        insertSort(array);
    }
}
