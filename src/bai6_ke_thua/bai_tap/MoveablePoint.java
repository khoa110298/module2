package bai6_ke_thua.bai_tap;


public class MoveablePoint extends Point2D{
    float xSpeed;
    float ySpeed;

    public MoveablePoint() {
        super();
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Object[] getSpeed() {
        Object[] objectArray = new Object[2];
        objectArray[0] = new float[]{this.xSpeed, this.ySpeed};
        objectArray[1] = this.xSpeed + " " + this.ySpeed;
        return objectArray;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                "} " + super.toString();
    }

    public MoveablePoint move() {
        this.x += this.xSpeed;
        this.y += this.ySpeed;

        return this;
    }


}
class TestMoveablePoint{
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1.1f,2.2f,3.3f,4.4f);
        System.out.println(moveablePoint.toString());
        System.out.println(moveablePoint.move());
    }
}