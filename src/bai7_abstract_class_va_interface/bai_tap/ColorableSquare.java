package bai7_abstract_class_va_interface.bai_tap;

public class ColorableSquare {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Square(5);
        shapes[1] = new Circle(7);
        shapes[2] = new Rectangle(4, 2); //height
        shapes[3] = new Square(3);

        if (shapes[2] instanceof Colorable) {
            Circle circle = (Circle) shapes[1];
            System.out.println(circle.toString());
            System.out.println(circle.getArea());
            circle.howToColor();

            Square square = (Square) shapes[0];
            System.out.println(square.toString());
            System.out.println(square.getArea());
            square.howToColor();
        }
    }
}
