package by.hw.lessons.hw_9;

import java.util.Objects;

public class Animal {
        protected String color;
        protected int MaxLifeExpectancy;
        protected String TypeOfFood;

        public Animal(String color, int MaxLifeExpectancy, String TypeOfFood) {
            this.color = color;
            this.MaxLifeExpectancy = MaxLifeExpectancy;
            this.TypeOfFood = TypeOfFood;
        }

        public void sounds() {
            System.out.println("Животное издаёт звук");
        }

        public void play() {
            System.out.println("Животное играет");
        }

        public String toString() {
            return String.format("Окрас: , Продолжительность жизни: , Питание: ",
                    color, MaxLifeExpectancy, TypeOfFood);
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Animal animal = (Animal) o;
            return MaxLifeExpectancy == animal.MaxLifeExpectancy
                    && Objects.equals(color, animal.color)
                    && Objects.equals(TypeOfFood, animal.TypeOfFood);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color, MaxLifeExpectancy, TypeOfFood);
        }
    }


