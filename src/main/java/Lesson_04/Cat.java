package Lesson_04;
import Lesson_04.Dish;
public class Cat extends Animal{

    public static int catCount = 0;
    public final int runRange = 200;
    public String name;
    public boolean satiety;

    public Cat(String name) {
        this.name = name;
        catCount++;
        animalCount++;
        this.satiety = false;
    }

    public Cat() {
    }

    @Override
    public void run(int i) {
        if(i <= runRange){
            System.out.println(this.name + " пробежал " + i + " м");
        }
    }

    @Override
    public void swim(int i) {
        System.out.println(this.name + " не умеет плавать");
    }

    public void eat(int i){
        if(Dish.getFood() - i >= 0){
            Dish.food = Dish.getFood() - i;
            this.satiety = true;
        } else this.satiety = false;
    }


    public void checkArraySatiety(){
        Cat[] arr = {new Cat("Barsik"), new Cat("Vaska"),new Cat("Shaurmichka"), new Cat("Murka"), new Cat("Petrovich")};

        for(Cat cat : arr){
            cat.eat(5);
            System.out.println(cat.satiety);
        }
    }
}
