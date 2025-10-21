package Lesson_02;

public class Lesson_02 {

    public void printThreeWords(){
        String s1 = "Orange";
        String s2 = "Banana";
        String s3 = "Apple";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    public void checkSumSign(){
        int a = 28;
        int b = 456;

        if(a + b >= 0){
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }
    }

    public void printColor(){
        int value = 56;

        if(value <= 0){
            System.out.println("Красный");
        }else if( value > 0 && value < 100){
            System.out.println("Желтый");
        }else {
            System.out.println("Зеленый");
        }
    }

    public void compareNumbers(){
        int a =34;
        int b = 8;
        if(a >= b){
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }

    public boolean twoValuesSumCompare(int a, int b){

            return  a + b >= 10 && a + b <= 20;

    }

    public void checkValueOnPositive(int a){
        if(a >= 0){
            System.out.println("Число положительное");
        }else System.out.println("Число отрицательное");
    }

    public boolean checkValuesOnNegativeBool(int a){

        return  a < 0;
    }

    public void printValueNumIter(String s, int a){
        for(int i = 0; i < a; i++ ){
            System.out.println(s);
        }
    }

    public boolean checkYearOnLeap(int a){

        return (a > 0) && ((a % 4 == 0) || (a % 4 == 0 && a % 100 == 0 && a % 400 == 0) || (a % 4 == 0 && a % 100 == 0 && a % 1000 == 0) );
    }

    public void arrayValuesSwap(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
            System.out.println(arr[i]);
        }
    }

    public void arrayCreate(){
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
            System.out.println(arr[i]);
        }
    }

    public void arrayValuesCheckSix(){
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
        }
    }

    public void doubleMatrix(){
        int[][] arr = new int[10][10];
        for(int i = 0; i < arr.length; i++){
            for(int b = 0; b < arr.length; b++){
                if(i == b) {
                    arr[i][b] = 1;
                    arr[i][arr.length -1-b]=1;
                }
            }

        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public int[] createArray(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
}
