package bai6_ke_thua.bai_tap;

public class Point3D extends Point2D {
    float z;

    public Point3D(){}

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
    public float[] getXYZ(){
        float[] array = new float[3];
//        super.getXY();
        array[0] = this.x;
        array[1] = this.y;
        array[2] = this.z;
        return array;
    }
    public void setXYZ(float x,float y,float z){
//        super.setXY(x,y);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
class TestPoint3D{
    public static void main(String[] args) {
        Point3D point3D = new Point3D(2.2f,3.3f,4.4f);
        System.out.println(point3D.toString());
    }
}
