package by.hw.lessons.hw_10;

import by.hw.lessons.hw_9.Animal;

import java.util.Objects;

public class Dog extends Animal {
    private String name;
    private String breed;
    protected double weight;

    public Dog(String breed, String color, int maxLifeSpan, String foodType, String name, double weight) {
        super(color, maxLifeSpan, foodType);
        this.name = name;
        this.weight = weight;
    }

    // Переопределенный метод equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!super.equals(o)) return false;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Double.compare(dog.weight, weight) == 0;
    }

    // Переопределенный метод hashCode
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, weight);
    }
}