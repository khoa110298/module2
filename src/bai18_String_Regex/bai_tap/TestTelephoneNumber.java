package bai18_String_Regex.bai_tap;

import java.util.Scanner;

public class TestTelephoneNumber {
    public static void main(String[] args) {
        TelephoneNumber telephoneNumber = new TelephoneNumber();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập số điện thoại: ");
//        String number = scanner.nextLine();
        boolean isvalid = telephoneNumber.validata("(84)-(0978489648)");
        System.out.println(isvalid);
    }
}
