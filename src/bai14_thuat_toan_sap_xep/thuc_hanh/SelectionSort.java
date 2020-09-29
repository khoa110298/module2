package bai14_thuat_toan_sap_xep.thuc_hanh;

public class SelectionSort {

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            double min = list[i];
            int index = i;
            for (int j = i +1; j < list.length; j++) {
                if (min > list[j]) {
                    min = list[j];
                    index = j;
                }
            }
            if (index != i) {
                list[index] = list[i];
                list[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list);
        for (double x : list) {
            System.out.println(x);
        }
    }
}
