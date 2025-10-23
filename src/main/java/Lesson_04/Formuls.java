package Lesson_04;

public interface Formuls {



    default double perimetr() {
        return 0.0;
    }

    default double area() {
        return 0.0;
    }

    default void printInfo(){
        System.out.println(perimetr() + ", " +  area() + ", " + "backgroundColor" + ", " + "borderColor");
    }
}
