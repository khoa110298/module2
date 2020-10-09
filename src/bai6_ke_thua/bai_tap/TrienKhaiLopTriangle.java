package bai6_ke_thua.bai_tap;

import bai6_ke_thua.thuc_hanh.Shape;

public class TrienKhaiLopTriangle extends Shape {
    public double side1 = 1;
    public double side2 = 1;
    public double side3 = 1;
    public TrienKhaiLopTriangle(){}

    public TrienKhaiLopTriangle(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter(){
        return getSide1()+getSide2()+getSide3();
    }
    public double getArra(){
        double p = getPerimeter()/2;
        return Math.sqrt(p*(p-getSide1())*(p-getSide2())*(p-getSide3()));
    }

    @Override
    public String toString() {
        return super.toString()+"ba cạnh của tam giác lần lượt là: "
                +getSide1()+","+getSide2()+","+getSide3()
                +" có chu vi là: " +getPerimeter()
                +" có diện tích là: " +getArra();
    }
}
class TestTriangle{
    public static void main(String[] args) {
        TrienKhaiLopTriangle triangle = new TrienKhaiLopTriangle();
        System.out.println(triangle);
        triangle = new TrienKhaiLopTriangle(2,3,4);
        System.out.println(triangle);
    }
}
