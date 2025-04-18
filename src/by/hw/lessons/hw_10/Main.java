package by.hw.lessons.hw_10;

import by.hw.lessons.hw_9.Bird;
import by.hw.lessons.hw_9.Dog;

public class Main {
    public static void main(String[] args) {

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog("Оливер", "кавалер кинг чарльз", 10, "триколо", 7, "корм");
        dogs[1] = new Dog("Черри", "корги", 11, "черно-белая", 11, "мясо");


        Bird[] birds = new Bird[2];
        birds[0] = new Bird("белый", 3, "рыба", "чайка", 50);
        birds[1] = new Bird("бело чёрный", 4, "червяки", "дятел", 70);

        System.out.println(dogs[0].equals(dogs[1]));
        System.out.println(birds[0].equals(birds[1]));

        System.out.println(dogs[0].hashCode() == dogs[1].hashCode());
        System.out.println(birds[0].hashCode() == birds[1].hashCode());
    }
}