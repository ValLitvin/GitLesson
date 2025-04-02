package by.hw.lessons.hw_11;

    public class RobotCooker implements Robot {
    private String model;
    private double powerConsumption;
    private String countryOfOrigin;
    private String cookingUnit;
    private boolean isOn;

    public RobotCooker (String model, double powerConsumption, String countryOfOrigin, String cookingUnit){
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.countryOfOrigin = countryOfOrigin;
        this.cookingUnit = cookingUnit;
        this.isOn = false;
    }

        @Override
        public String createItem() {
            return "";
        }

        @Override
        public void turnOn() {
            isOn = true;
            System.out.println("Робот-повар готовит");
        }

        @Override
        public void turnOff() {
            isOn = false;
            System.out.println("Робот-повар выключен");
        }

        @Override
        public void uniquePossibility() {
            if (isOn){
                System.out.println("Робот готовит");
            } else {
                System.out.println("Робот выключен");
            }
        }
    }

