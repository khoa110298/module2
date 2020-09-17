package bai7_Abstract_Class_va_Interface.bai_tap;

public class ColorableSquare extends Square implements Colorable {

    @Override
    public String howToColor() {
        return "Color all four sides ";
    }
}
class ColorableSquareTest {
    public static void main(String[] args) {
        ColorableSquare colorableSquare = new ColorableSquare();
        System.out.println(colorableSquare.toString());
        System.out.println(colorableSquare.getArea());
        System.out.println(colorableSquare.howToColor());
    }
}
