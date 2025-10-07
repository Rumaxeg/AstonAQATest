package Lesson_04;

public class Dog extends Animal{

    public static int dogCount = 0;
    public final int runRange = 500;
    public final int swimRange = 50;
    public String name;

    public Dog(String name) {
        this.name = name;
        dogCount++;
        animalCount++;
    }

    @Override
    public void run(int i) {
        if(i <= runRange){
            System.out.println(this.name + " пробежал " + i + " м");
        }
    }

    @Override
    public void swim(int i) {
        if(i <= swimRange){
            System.out.println(this.name + " проплыл " + i + " м");
        }
    }
}
