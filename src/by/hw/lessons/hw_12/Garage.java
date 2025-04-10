package by.hw.lessons.hw_12;

public class Garage< T extends  Vehicle > {
    private T Vehicle;

    public  Garage (T Vehicle) {
        this.Vehicle = Vehicle;
    }
    public  boolean isEntryPermitted(){
        return  Vehicle.getEmission() <=100;
    }
    public T getVehicle(){
        return Vehicle;
    }
}