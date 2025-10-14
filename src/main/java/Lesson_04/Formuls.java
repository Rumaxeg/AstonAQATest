package Lesson_04;

public interface Formuls {

    default double perimetr(Circle circle){
        return circle.getRadius() * 3.14 * 2;
    }
    default double perimetr(Triangle triangle){
        return triangle.getA() + triangle.getB() + triangle.getC();
    }
    default double perimetr(Rectangle rectangle){
        return  (rectangle.getHeight() + rectangle.getLength()) * 2;
    }
}
