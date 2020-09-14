package bai4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        double delta = this.b*this.b - 4*this.a*this.c;
        return delta;
    }
    public double getRoot1(){
        return (-b + Math.sqrt(this.getDiscriminant()))/(2*this.a);
    }
    public double getRoot2(){
        return (-b - Math.sqrt(this.getDiscriminant()))/(2*this.a);
    }

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập hệ số a: ");
        double a = sc.nextDouble();
        System.out.print("nhập hệ số b: ");
        double b = sc.nextDouble();
        System.out.print("nhập hệ số c: ");
        double c = sc.nextDouble();
        QuadraticEquation abc = new QuadraticEquation(a,b,c);
        if (abc.getDiscriminant()<0){
            System.out.println("phương trình vô nghiệm ");
        }else if (abc.getDiscriminant()==0){
            System.out.println("phương trình có 1 nghiệm là: "+  abc.getRoot1());
        }
        System.out.println("nghiệm thứ nhất là: " + abc.getRoot1() + "nghiệm thứ hai là: " + abc.getRoot2());
    }
}
