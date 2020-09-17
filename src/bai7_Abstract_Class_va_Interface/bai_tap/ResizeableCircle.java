package bai7_Abstract_Class_va_Interface.bai_tap;

public class ResizeableCircle extends Circle implements Resizeable {

    public static double[] array(){
        double[] array = new double[100];
        for (int i = 0; i < 100; i++) {
            array[i] = (Math.random() * 100);
        }
        return array;
    }

    @Override
    public void resize(double percent) {

    }
}

