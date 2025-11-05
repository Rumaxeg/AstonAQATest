package lesson_06;

import java.util.Arrays;

public class Student {

    public String name;
    public String group;
    public int course;
    public int[] score;
    public int averageScore;

    public Student(String name, String group, int course, int[] score) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.score = score;
        this.averageScore = averageScore();
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int averageScore() {
        return  (int) Arrays.stream(this.score).average().orElse(Double.NaN);
    }

    public int getAverageScore() {
        return averageScore;
    }

    public String getName() {
        return name;
    }
}
