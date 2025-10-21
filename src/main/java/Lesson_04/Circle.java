package Lesson_04;

public class Circle extends Shapes{
    public int radius;


    public Circle(String backgroundColor, String borderColor, int radius) {
        super(backgroundColor, borderColor);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double Area(){
        return  3.14 * getRadius() * getRadius();
    }

    @Override
    public double perimetr(){
        return this.getRadius() * 3.14 * 2;
    }

    public void printInfo(){
        System.out.println(perimetr() + ", " +  this.Area() + ", " + this.backgroundColor + ", " + this.borderColor);
    }
}
