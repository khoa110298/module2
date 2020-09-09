package bai1_introduction_to_java.bai_tap;
import java.util.Scanner;
public class ChuyenDoiTienTe {
    public static void main(String[] args){
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số tiền cần chuyển: ");
        usd = sc.nextDouble();
        double doi = usd*vnd;
        System.out.println("số tiền đã chuyển là: " + doi);

    }
}
