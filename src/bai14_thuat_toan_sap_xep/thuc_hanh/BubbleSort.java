package bai14_thuat_toan_sap_xep.thuc_hanh;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] list) {

        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }
}
