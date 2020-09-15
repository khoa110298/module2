package bai4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Arrays;

public class XayDungLopStopWatch {

    public static int[] arrayInt(){
        int []arrayInt = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arrayInt[i] = (int)(Math.random() * 100000);
        }
        return arrayInt;
    }

    public static void sapXep(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int maxIndex = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        int array[] = arrayInt();

        sapXep(array);

        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }

}
