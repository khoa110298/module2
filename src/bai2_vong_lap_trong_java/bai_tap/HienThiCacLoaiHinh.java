package bai2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choise;
        System.out.println("Menu: ");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        while (true){
            choise = sc.nextInt();
            switch (choise){
                case 1:
                    System.out.print("nhập chiều dài: ");
                    int a = sc.nextInt();
                    System.out.print("nhập chiều rộng: ");
                    int b = sc.nextInt();
                    String rectangle = "";
                    for (int i=1; i<=a;i++){
                        for (int j=1;j<=b;j++){
                            rectangle +="*";
                        }
                        rectangle +="\n";
                    }
                    System.out.println(rectangle);
                    break;
                case 2:
                    System.out.println("nhập cạnh tam giác");
                    int x = sc.nextInt();
                    String square_triangle = "";
                    for (int i=1; i<=x; i++){
                        for (int j=1;j<=i;j++){
                            square_triangle +="*";
                        }
                        square_triangle +="\n";
                    }
                    System.out.println(square_triangle);
                    break;
                case 3:
                    System.out.println("nhập cạnh tam giác");
                    int y = sc.nextInt();
                    String isosceles_triangle = "";
                    for (int i=y; i>=1; i--){
                        for (int j=1; j<=i; j++){
                            isosceles_triangle +="*";
                        }
                        isosceles_triangle +="\n";
                    }
                    System.out.println(isosceles_triangle);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
