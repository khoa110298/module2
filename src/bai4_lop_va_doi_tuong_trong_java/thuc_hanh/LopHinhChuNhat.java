package bai4_lop_va_doi_tuong_trong_java.thuc_hanh;


import bai4_lop_va_doi_tuong_trong_java.bai_tap.Rectangle;

import java.util.Scanner;

public class LopHinhChuNhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Rectangle rec = new Rectangle(width,height);
        System.out.println("Rectangle: " + rec.display());
        System.out.println("outArea: " + rec.getArea());
        System.out.println("outPerimeter:" + rec.getPerimeter());
    }
}
