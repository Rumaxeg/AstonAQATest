package Lesson_04;

public class Rectangle extends Shapes{

    public int length;
    public int height;


    public Rectangle(String backgroundColor, String borderColor, int length, int height) {
        super(backgroundColor, borderColor);
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double area(){
        return getHeight() * getLength();
    }

    @Override
    public double perimetr(){
        return  (this.getHeight() + this.getLength()) * 2;
    }

    @Override
    public void printInfo(){
        System.out.println(perimetr() + ", " +  area() + ", " + getBackgroundColor() + ", " + getBorderColor());
    }
}
