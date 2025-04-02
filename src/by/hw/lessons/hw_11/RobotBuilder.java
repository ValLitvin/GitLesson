package by.hw.lessons.hw_11;

public class RobotBuilder implements  RobotEngineer {
    private String model;
    private double powerConsumption;
    private String countryOfOrigin;
    private String constructionUnit;
    private String material;
    boolean isOn;

public RobotBuilder(String model, double powerConsumption, String countryOfOrigin, String constructionUnit, String material){
    this.model = model;
    this.powerConsumption = powerConsumption;
    this.countryOfOrigin = countryOfOrigin;
    this.material = material;
    this.isOn = false;
}

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Робот-строитель включён");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Робот-строитель выключен");
    }

    @Override
    public void uniquePossibility() {
        if (isOn){
            System.out.println("Робот-строитель строит здание");
        } else {
            System.out.println("Робот-строитель выключен");
        }
    }

    @Override
    public String createItem(){
        System.out.println("Робот-строитель создаёт бетон");
        return null;
    }

}