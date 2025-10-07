package Lesson_04;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Triangle implements Formuls{
    int a;
    int b;
    int c;
    public String backgroundColor;
    public String borderColor;

    public Triangle(int a, int b, int c, String backgroundColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double getHeigh() {
        return 2 * perimetr(this) / maxValue();
    }

    public double triangleArea(){
        return (double) maxValue() * getHeigh() / 2;
    }

    public int maxValue(){
        ArrayList list = new ArrayList<>();
        list.add(this.a);
        list.add(this.b);
        list.add(this.c);
        list.sort(null);
        return (Integer)list.getLast();
    }

    public void printInfo(){
        System.out.println(perimetr(this) + ", " +  this.triangleArea() + ", " + this.backgroundColor + ", " + this.borderColor);
    }
}
