package by.hw.lessons.hw_12;

public class Main {
    public  static void main (String[] args) {
        Garage<Car> carGarage = new Garage<>();
        Garage<Motorcycle> motorcycleGarage = new Garage<>();

        Car car = new Car("Touran", 93);
        Motorcycle motorcycle = new Motorcycle("KAWASAKI", 108);

        carGarage.Vehicle(car);
        motorcycleGarage.Vehicle(motorcycle);

        System.out.println("Транспортное средство в гараже: " + carGarage.getVehicle().getName());
        System.out.println("Разрешен ли въезд: " + carGarage.isEntryPermitted());

        System.out.println("------------------------ ");

        System.out.println("Транспортное средство в гараже: " + motorcycleGarage.getVehicle().getName());
        System.out.println("Разрешен ли въезд: " + motorcycleGarage.isEntryPermitted());
    }
}