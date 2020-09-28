package bai13_thuat_toan_tim_kiem.bai_tap;

import java.util.Scanner;

public class SuDungDeQuy {

    static int binarySearch(int[] list, int low, int high, int key) {
        if (high >= low) {
            int mid = (high + low) / 2;
            if (key == list[mid]) {
                return mid;
            } else if (key > list[mid]) {
                return binarySearch(list, mid + 1, high, key);
            } else {
                return binarySearch(list, low, mid - 1, key);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số cần tìm kiếm: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println(binarySearch(list, 0, list.length - 1, x));
    }
}
