package by.hw.lessons.hw_9;

public class Main {
    public static void main(String[] args) {
//Создаем массив c собаками
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Оливер", "кавалер кинг чарльз", 10, "триколо", 7, "корм");
        dogs[1] = new Dog("Черри", "корги", 11, "черно-белая", 11, "мясо");
        dogs[2] = new Dog("Викентий", "бульдожка", 18, "серый", 13, "что стащит со стола");

//Создаем птицу
        Bird[] birds = new Bird[3];
        birds[0] = new Bird("белый", 3, "рыба", "чайка", 50);
        birds[1] = new Bird("бело чёрный", 4, "червяки", "дятел", 70);
        birds[2] = new Bird("коричневый", 6, "мясо", "орёл", 100);

        ZOO zoo = new ZOO();

        //Добавляем животных в зоопарк
        zoo.addAnimal(dogs[0]);
        zoo.addAnimal(dogs[1]);
        zoo.addAnimal(dogs[2]);
        zoo.addAnimal(birds[0]);
        zoo.addAnimal(birds[1]);
        zoo.addAnimal(birds[2]);

        System.out.println("=== Демонстрация поведения собаки ===");
        dogs[0].bark();
        dogs[0].bite();
        dogs[0].run();
        dogs[0].play();
        dogs[0].jump();

        System.out.println("------------------------------"); // строка для разделения

        System.out.println("=== Демонстрация поведения птицы ===");
        birds[0].makeSound();
        birds[0].peck();
        birds[0].incubate();
        birds[0].makeSound();

        System.out.println("------------------------------"); // строка для разделения

        for (Dog dog : dogs)
            System.out.println(dog);

        System.out.println("------------------------------"); // строка для разделения

        for (Bird bird : birds)
            System.out.println(bird);

        System.out.println("------------------------------"); // строка для разделения

        // Демонстрация поведения
        Animal[] animals = zoo.getAnimals();
        for (Animal animal : animals) {
            animal.sounds();
            animal.play();
            System.out.println(animal);
            System.out.println("------------------------------"); // строка для разделения
        }
    }
}