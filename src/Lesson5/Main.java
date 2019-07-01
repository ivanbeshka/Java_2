package Lesson5;

public class Main {
    public static void main(String[] args) {
        final int SIZE = 1000000;

        millisWholeArr(SIZE);
        millisArrOn2(SIZE);

    }

    public static void millisWholeArr(int SIZE) {
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
    }

    public static void millisArrOn2(int SIZE){
        final int h = SIZE / 2;
        float[] arr = new float[SIZE];
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        Main2 main2 = new Main2(arr2);
        main2.start();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(main2.getArr2(), 0, arr, h, h);

        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);

    }
}
