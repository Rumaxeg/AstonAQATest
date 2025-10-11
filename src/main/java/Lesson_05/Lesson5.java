package Lesson_05;

public class Lesson5 {

    public int matrixException(String [][] arr){
        int value = 0;
        if(arr.length != 4){
            throw new MyArraySizeException();
        } else if (arr[0].length != 4) {
            throw new MyArraySizeException();
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                try {
                    value += Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("В ячейке : arr[" + i + "][" + j + "] лежит не число");
                }

            }
        }

    return value;
    }

}
