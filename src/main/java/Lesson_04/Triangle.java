package Lesson_04;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Triangle extends Shapes{

    public int a;
    public int b;
    public int c;


    public Triangle(String backgroundColor, String borderColor, int a, int b, int c) {
        super(backgroundColor, borderColor);
        this.a = a;
        this.b = b;
        this.c = c;
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
        return 2 * perimetr() / maxValue();
    }

    @Override
    public double area(){
        return (double) maxValue() * getHeigh() / 2;
    }

    @Override
    public double perimetr(){
        return this.getA() + this.getB() + this.getC();
    }

    public int maxValue(){
        ArrayList list = new ArrayList<>();
        list.add(this.a);
        list.add(this.b);
        list.add(this.c);
        list.sort(null);
        return (Integer)list.getLast();
    }

    @Override
    public void printInfo(){
        System.out.println(perimetr() + ", " +  area() + ", " + getBackgroundColor() + ", " + getBorderColor());
    }
}
