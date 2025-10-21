package Lesson_03;

import java.util.ArrayList;

public class Park {
    public String name;
    public ArrayList<Attraction> attractions;

    public Park(String name) {
        this.name = name;
        attractions = new ArrayList<>();
    }

    public Park() {
    }

    public class Attraction{
       public String name;
        public String workingTime;
        public int price;

        public Attraction(String name, String workingTime, int price) {
            this.name = name;
            this.workingTime = workingTime;
            this.price = price;
        }

        public Attraction() {
        }
    }
}
