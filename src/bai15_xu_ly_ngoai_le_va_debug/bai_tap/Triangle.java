package bai15_xu_ly_ngoai_le_va_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    public static void area(int a, int b, int c) {
        try {
            if (a <= 0 || b <= 0 || c <= 0 ||a + b <= c || a + c <= b || b + c <= a) {
               throw new IllegalTriangleException();
            } else {
                int p = a + b + c;
                System.out.println("diện tích tam giác là: " + Math.sqrt(p / 2 * (p / 2 - a) * (p / 2 - b) * (p / 2 - c)));
            }
        } catch (IllegalTriangleException e) {
            System.err.println("nhập sai rồi sửa lại đi");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập ba cạnh của tam giác");
        System.out.println("nhập cạnh a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập cạnh b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập cạnh c: ");
        int c = Integer.parseInt(scanner.nextLine());

        Triangle triangle = new Triangle();
        triangle.area(a,b,c);

    }
}
