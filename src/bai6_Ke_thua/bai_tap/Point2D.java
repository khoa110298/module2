package bai6_Ke_thua.bai_tap;

import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;

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

    public String getXY() {
        float[] array = new float[2];
        array[0]=x;
        array[1]=y;
        return Arrays.toString(array);
    }

    public void setXY(float x,float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "point có tọa độ x,y là: " + getXY();
    }
}
class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.3f, 5.6f);
        System.out.println(point2D);
    }
}
