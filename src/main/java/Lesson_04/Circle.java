package Lesson_04;

public class Circle implements Formuls{
    public int radius;
    public String backgroundColor;
    public String borderColor;

    public Circle(int radius, String backgroundColor, String borderColor) {
        this.radius = radius;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public int getRadius() {
        return radius;
    }
    public double circleArea(){
        return  3.14 * getRadius() * getRadius();
    }
    public void printInfo(){
        System.out.println(perimetr(this) + ", " +  this.circleArea() + ", " + this.backgroundColor + ", " + this.borderColor);
    }
}
