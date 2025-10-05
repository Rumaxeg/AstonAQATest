package Lesson_03;

public class Park {
    Attraction attraction;

    public Park(Attraction attraction) {
        this.attraction = attraction;
    }

    public Park() {
    }

    public class Attraction{
        String workingTime;
        int price;

        public Attraction(String workingTime, int price) {
            this.workingTime = workingTime;
            this.price = price;
        }

        public Attraction() {
        }
    }
}
