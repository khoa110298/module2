package bai7_abstract_class_va_interface.bai_tap;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
//        return "A Rectangle with width="
//                + getWidth()
//                + " and length="
//                + getLength()
//                + ", which is a subclass of "
               return super.toString();
    }

    @Override
    public void resize(double percent) {
        this.width += this.width*percent/100;
        this.length +=this.length*percent/100;
    }
}
class ResizeableRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,6);
        System.out.println("diện tích trước khi thay đổi là: " + rectangle.getArea());
        rectangle.resize(Math.random()*100);
        System.out.println("diện tích sau khi thay đổi là: " + rectangle.getArea());
    }
}