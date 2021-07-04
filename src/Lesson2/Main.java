package Lesson2;

public class Main {
    public static void main(String[] args) {

        String[][] array = new String[][]{{"1","1","1","srrrr"},{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};


        try {
            System.out.println(array(array));
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }

    }

    public static int array(String[][] array) throws MyArraySizeException {
        int arrLen = 0;
        int helpLen = 0;
        int arrHei = 0;
        int sum = 0;

        int x = 0;
        int y = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                helpLen++;
                if(helpLen == 4){
                    helpLen = 0;
                    arrLen++;
                }
            }
            arrHei++;
        }

        if (!(arrHei == 4 && arrLen == 4)) {
            throw new MyArraySizeException("Размер массива не 4*4", arrLen, arrHei);
        }

        try {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sum += Integer.parseInt(array[i][j]);
                    x = i;
                    y = j;

                }
            }
        }catch (NumberFormatException e){
            try {
                throw new MyArrayDataException("Найден строчной элемент в массиве",x,y);
            }catch (MyArrayDataException ex){
                ex.printStackTrace();
            }
        }
return sum;

    }

    public static int sum(String[][] array) throws MyArrayDataException {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += Integer.parseInt(array[i][j]);
            }
        }
        return sum;
    }
}
