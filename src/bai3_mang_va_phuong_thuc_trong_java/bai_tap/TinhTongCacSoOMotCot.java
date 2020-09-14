package bai3_mang_va_phuong_thuc_trong_java.bai_tap;

public class TinhTongCacSoOMotCot {
    public static void main(String[] args) {
        double arr[][] = {{3.0,2.0,4.0,5.5},
                          {1.5,5.0,6.0,4.0,},
                          {2.5,2.5,4.5,7.0}};
        double sum1 = 0.0;
        double sum2 = 0.0;
        double sum3 = 0.0;
        double sum4 = 0.0;
        for (int i =0;i<3;i++){
                sum1 += arr[i][0];
                sum2 += arr[i][1];
                sum3 += arr[i][2];
                sum4 += arr[i][3];
    }
        System.out.print("tổng các cột lần lượt là: " + sum1 + "\t" + sum2 + "\t" + sum3 + "\t" + sum4);
    }
}
