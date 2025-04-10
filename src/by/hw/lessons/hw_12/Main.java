package by.hw.lessons.hw_12;

public class Main {
    public  static void main (String[] args){

        Garage<Car> carGarage = new Garage<>(new Car("Touran", 83));
        Garage<Motorcycle> motorcycleGarage = new Garage<>(new Motorcycle("KAWASAKI", 107));


        System.out.println("Car: " + carGarage.getVehicle().getName());
        System.out.println("Entry permitted: " + carGarage.isEntryPermitted());

        System.out.println("------------------------------");

        System.out.println("Motorcycle: " + motorcycleGarage.getVehicle().getName());
        System.out.println("Entry permitted: " + motorcycleGarage.isEntryPermitted());
    }
}