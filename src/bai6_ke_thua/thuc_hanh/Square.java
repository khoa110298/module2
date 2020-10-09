package bai6_ke_thua.thuc_hanh;

public class Square extends Rectangle {
    private double size = 1.0;
    public Square(){}

    public Square(double size){
        super(size,size);
    }
    public Square(double size,String color,boolean filled){
        super(size,size,color,filled);
    }
    public double getSize(){
        return getLength();
    }
    public void setSize(double size){
        setLength(size);
        setWidth(size);
    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }

    @Override
    public void setLength(double length) {
        setSize(length);
    }

    @Override
    public String toString() {
        return super.toString()+"Square{" +
                "size=" + getSize() +
                '}';
    }
}
class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", false);
        System.out.println(square);
    }
}
