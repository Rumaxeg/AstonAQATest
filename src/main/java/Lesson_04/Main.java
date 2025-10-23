package Lesson_04;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dish dish = new Dish();
        dish.setFood(20);
        cat.checkArraySatiety();

        Circle circle = new Circle("Green","Blue",4);
        circle.printInfo();
        Triangle triangle = new Triangle( "Red", "Green", 5, 2, 3);
        triangle.printInfo();
        Rectangle rectangle = new Rectangle( "Blue", "Black", 3, 4);
        rectangle.printInfo();
    }
}
