package by.hw.lessons.hw_12;

public class Vehicle {
    private String name;
    private int emission;

public Vehicle (String name, int emission) {
    this.name = name;
    this.emission = emission;
}
public  String getName(){
        return name;
}
public void setName(String name){
    this.name = name;
}
public  int getEmission(){
    return emission;
}
public void setEmission(int emission){

    this.emission = emission;
}
}