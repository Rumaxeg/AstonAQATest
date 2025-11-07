package lesson_07Tests;

import lesson_07.Lesson07;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lesson07Tests {

    Lesson07 lesson07 = new Lesson07();

    @Test
    public void factorialTest() {
        Assertions.assertEquals(3628800, lesson07.getFactorial(10), "10 failed");
        Assertions.assertEquals(1, lesson07.getFactorial(0), "0 failed");
        Assertions.assertThrows(IllegalArgumentException.class, () -> lesson07.getFactorial(-1), "-1 failed");
    }

    @Test
    public void triangleAreaTest() {
        Assertions.assertEquals(6, lesson07.getTriangleArea(3, 4));
        Assertions.assertThrows(IllegalArgumentException.class, () -> lesson07.getTriangleArea(0, 1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> lesson07.getTriangleArea(1, 0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> lesson07.getTriangleArea(-1, 3));
        Assertions.assertThrows(IllegalArgumentException.class, () -> lesson07.getTriangleArea(3, -1));
    }

    @Test
    public void maxValueTest() {
        Assertions.assertEquals(5, lesson07.getMaxValue(3, 5), "5 failed");
        Assertions.assertEquals(-1, lesson07.getMaxValue(-3, -1), "-1 failed");
    }

    @Test
    public void calculateTest() {
        Assertions.assertEquals(5, lesson07.calculate("+", 2, 3), "5 failed +");
        Assertions.assertEquals(-5, lesson07.calculate("+", -2, -3), "-5 failed +");
        Assertions.assertEquals(2, lesson07.calculate("-", 4, 2), "2 failed -");
        Assertions.assertEquals(-5, lesson07.calculate("-", -2, 3), "-5 failed -");
        Assertions.assertEquals(6, lesson07.calculate("*", 2, 3), "6 failed *");
        Assertions.assertEquals(-6, lesson07.calculate("*", -2, 3), "-5 failed *");
        Assertions.assertEquals(0, lesson07.calculate("*", 0, 3), "0 failed *");
        Assertions.assertEquals(3, lesson07.calculate("/", 9, 3), "3 failed /");
        Assertions.assertEquals(-3, lesson07.calculate("/", -9, 3), "-3 failed /");
        Assertions.assertThrows(ArithmeticException.class, () -> lesson07.calculate("/", 3, 0), "0 failed /");
        Assertions.assertThrows(IllegalArgumentException.class, () -> lesson07.calculate("?", 3, 1), "?");
    }
}
