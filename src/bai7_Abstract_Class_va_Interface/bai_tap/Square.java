package bai7_Abstract_Class_va_Interface.bai_tap;

public class Square extends Rectangle implements Colorable, Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

}
class ResizeableSquare{
    public static void main(String[] args) {
        Square square = new Square(10);
        System.out.println("diện tích trước khi thay đổi là: " + square.getArea());
        square.resize(Math.random()*100);
        System.out.println("diện tích sau khi thay đổi là: " + square.getArea());
    }
}