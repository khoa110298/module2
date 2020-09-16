package bai6_Ke_thua.bai_tap;

import java.util.Arrays;

public class Point3D extends Point2D {
    float z;

    public Point3D(float x,float y,float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public String getXYZ(){
        float[] array = new float[3];
//        super.getXY();
        array[0] = getX();
        array[1] = getY();
        array[2] = getZ();
        return Arrays.toString(array);
    }
    public void setXYZ(float x,float y,float z){
        super.setXY(x,y);
//        this.x = x;
//        this.y = y;
        this.z = getZ();
    }

    @Override
    public String toString() {
        return "point có tọa độ xyz là: " + getXYZ();
    }
}
class TestPoint3D{
    public static void main(String[] args) {
        Point3D point3D = new Point3D(2.2f,3.3f,4.4f);
        System.out.println(point3D);
        System.out.println(point3D.getXY());

    }
}
