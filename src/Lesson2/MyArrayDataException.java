package Lesson2;

class MyArrayDataException extends NumberFormatException {


    public MyArrayDataException(String message, int i, int j) {
        super(message);
        System.out.println("Номер элемента : " + i + " " + j);
    }
}
