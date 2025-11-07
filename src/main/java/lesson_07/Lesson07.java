package lesson_07;

public class Lesson07 {

    public int getFactorial(int value) {
        int res = 1;
        if (value < 0) {
            throw new IllegalArgumentException("Число меньше нуля");
        }
        for (int i = 1; i <= value; i++) {
            res = res * i;
        }
        return res;
    }

    public int getTriangleArea(int a, int b) {
        if (a <= 0 || b <= 0){
            throw new IllegalArgumentException("Недопустимое значение");
        }
        return (a * b) / 2;
    }

    public int getMaxValue(int a, int b) {
        return Math.max(a, b);
    }

    public int calculate(String s, int a, int b) {
        switch (s) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("На ноль не делим");
                }
                return a / b;
            default: throw new IllegalArgumentException("Недопустимое значение");
        }
    }
}
