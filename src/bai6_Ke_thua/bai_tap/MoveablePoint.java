package bai6_Ke_thua.bai_tap;

import java.util.Arrays;

public class MoveablePoint extends Point2D{

    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public String getSpeed(){
        float[] array = new float[2];
        array[0] = getxSpeed();
        array[1] = getySpeed();
        return Arrays.toString(array);
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "tọa độ x,y là: " + getXY()
                +" tốc độ di chuyển của x,y là: " + getSpeed();
    }
    public String move(){
        this.x +=getxSpeed();
        this.y +=getySpeed();
        return getXY();
    }
}
class TestMoveablePoint{
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1.1f,2.2f,3.3f,4.4f);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
