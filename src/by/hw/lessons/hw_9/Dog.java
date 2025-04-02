package by.hw.lessons.hw_9;

public class Dog extends Animal {
    private String name;
    private String breed;
    private double weight;

    public Dog (String name, String breed, double weight, String color, int MaxLifeExpectancy, String TypeOfFood) {
        super(color, MaxLifeExpectancy, TypeOfFood);
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public void bark() {
        System.out.println(name + " лает: Гав-гав!");
    }

    public void play() {
        System.out.println(name + " весело играет");
    }

    public void bite() {
        System.out.println(name + " кусает");
    }

    public void run() {
        System.out.println(name + " быстро бегает ");
    }

    public void jump() {
        System.out.println(name + " прыгает.");
    }

    @Override
    public String toString() {
        return "Информация о собаке: " + "имя = " + name + ", порода = " + breed + ", средний вес = " + weight + ", " + super.toString();
    }
}


