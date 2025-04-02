package by.hw.lessons.hw_9;

public class ZOO {

    private Animal[] animals;

    public void addAnimal(Animal animal) {
        Animal[] newAnimals = new Animal[animals == null ? 1 : animals.length + 1];
        if (animals != null) {
            int i = 0;
            for (Animal animal1 : animals) {
                newAnimals[i] = animal1;
                i++;
            }
        }
        newAnimals[newAnimals.length - 1] = animal;
        animals = newAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }
}
