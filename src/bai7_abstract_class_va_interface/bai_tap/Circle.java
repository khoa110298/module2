package bai7_abstract_class_va_interface.bai_tap;

public class Circle extends Shape implements Colorable, Resizeable{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius + this.radius * percent / 100;
    }
}
class ResizeableCircle{
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("diện tích trước khi tăng bán kính là: " + circle.getArea());
        circle.resize(Math.random() * 100);
        System.out.println("diện tích sau khi tăng bán kính là: " + circle.getArea());
    }
}
