package bai5_access_modifier.bai_tap;

public class AccessModifier {
     public double radius = 1.0;
     public String color = "red";
     public AccessModifier(){};
     public AccessModifier(double radius){
         this.radius = radius;
     }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
class TestCircle{
    public static void main(String[] args) {
        AccessModifier circle = new AccessModifier();
        System.out.println("bán kính: "+circle.getRadius());
        System.out.println("diện tích: " + circle.getArea());
    }
}
