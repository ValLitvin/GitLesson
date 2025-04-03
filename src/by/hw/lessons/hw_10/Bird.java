package by.hw.lessons.hw_10;

import by.hw.lessons.hw_9.Animal;

import java.util.Objects;

public class Bird extends Animal {
    private final String family;
    private final int maxFlightHeight;

    public Bird(String color, int maxLifeSpan, String foodType, String family, int maxFlightHeight) {
        super(color, maxLifeSpan, foodType);
        this.family = family;
        this.maxFlightHeight = maxFlightHeight;
    }

    // Переопределенный метод equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false; // Проверка полей Animal
        Bird bird = (Bird) o;
        return maxFlightHeight == bird.maxFlightHeight
                && Objects.equals(family, bird.family);
    }

    // Переопределенный метод hashCode
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), family, maxFlightHeight);
    }

}