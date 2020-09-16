package bai6_Ke_thua.bai_tap;

import java.util.Arrays;

public class Point2D {
    float x;
    float y;

    public Point2D(){}

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float[] array = {this.x,this.y};
        return array;
    }

    public void setXY(float x,float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.3f, 5.6f);
        System.out.println(point2D.toString());
    }
}
