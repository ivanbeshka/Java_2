package Lesson2;

class MyArraySizeException extends Exception {

    int arrLen;
    int arrHei;

    public int getArrHei() {
        return arrHei;
    }

    public int getArrLen() {
        return arrLen;
    }

    public MyArraySizeException(String message, int arrLen, int arrHei){
        super(message);

        this.arrHei = arrHei;
        this.arrLen = arrLen;
    }
}
