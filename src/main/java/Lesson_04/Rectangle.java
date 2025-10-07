package Lesson_04;

public class Rectangle implements Formuls{
    int length;
    int height;
    public String backgroundColor;
    public String borderColor;

    public Rectangle(int length, int height, String backgroundColor, String borderColor) {
        this.length = length;
        this.height = height;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public double rectangleArea(){
        return getHeight() * getLength();
    }

    public void printInfo(){
        System.out.println(perimetr(this) + ", " +  this.rectangleArea() + ", " + this.backgroundColor + ", " + this.borderColor);
    }
}
