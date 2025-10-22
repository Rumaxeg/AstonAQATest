package Lesson_04;

public abstract class Shapes implements Formuls {

    public String backgroundColor;
    public String borderColor;

    public Shapes(String backgroundColor, String borderColor) {
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }
}
