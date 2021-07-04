package Lesson5;

public class Main2 extends Thread {
    float[] arr2;

    @Override
    public void run() {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public Main2(float[] arr) {
        this.arr2 = arr;
    }

    public float[] getArr2() {
        return arr2;
    }
}
