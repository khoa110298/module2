package bai6_ke_thua.bai_tap;

public class Cylinder extends Circle {
    private double radius;
    private String color;
    private double height;
    public Cylinder(){}

    public Cylinder(double radius,String color,double height){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolum(){
        return getHeight() * super.getArea();
    }

    @Override
    public String toString() {
        return super.toString()+" volum " + getVolum();
    }
}
class CylinderTest{
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2,"blue",5);
        System.out.println(cylinder);
        System.out.println();
        cylinder = new Cylinder(3,"red",10);
        System.out.println(cylinder);
    }
}
