package by.hw.lessons.hw_9;


public class Bird extends Animal {
    private final String family;
    private final int maxFlightHeight;

    public Bird(String color, int maxLifeSpan, String foodType, String family, int maxFlightHeight) {
        super(color, maxLifeSpan, foodType);
        this.family = family;
        this.maxFlightHeight = maxFlightHeight;
    }

    public void makeSound() {
        System.out.println(family + " поет.");
    }

    public void peck() {
        System.out.println(family + " клюёт.");
    }

    public void incubate() {
        System.out.println(family + " высиживает птенцов.");
    }

    // Переопределение родительского родительского метода toString()
    @Override
    public String toString() {
        return "Информация о птице: " + "семейство = " + family + ", максимальная высота полета = " + maxFlightHeight + ", " + super.toString();
    }
}
