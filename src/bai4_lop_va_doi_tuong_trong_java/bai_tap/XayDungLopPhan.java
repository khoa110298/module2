package bai4_lop_va_doi_tuong_trong_java.bai_tap;

public class XayDungLopPhan {
    final static int Slow = 1;
    final static int Medium = 2;
    final static int Fast = 3;
    private int speed;
    boolean on;
    private double radius;
    private String color;

    public XayDungLopPhan() {
        this.speed = Slow;
        this.radius = 5;
        this.color = "blue";
        this.on = false;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getOn() {
        if (this.on) {
            return "on";
        } else {
            return "off";
        }
    }
    public void setOn(boolean on){
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if (on){
            return ("Speed " + this.speed + " radius " + this.radius + " color " + this.color + " fan is on");
        }else {
            return ("Speed " + this.speed + " radius " + this.radius + " color " + this.color + " fan is off");
        }
    }

    public static void main(String[] args) {
      XayDungLopPhan fan1 = new XayDungLopPhan();
      fan1.setRadius(10);
      fan1.setSpeed(XayDungLopPhan.Fast);
      fan1.setColor("yellow");
      fan1.setOn(true);
      System.out.println(fan1.toString());
        System.out.println();
      XayDungLopPhan fan2 = new XayDungLopPhan();
      fan2.setRadius(5);
      fan2.setSpeed(XayDungLopPhan.Medium);
      fan2.setColor("blue");
      fan2.setOn(false);
      System.out.println(fan2.toString());
    }
}
