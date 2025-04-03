package by.hw.lessons.hw_11;

 class RobotSapper implements RobotEngineer {
     private String model;
     private double powerConsumption;
     private String mineClearance;
     private String material;
     private boolean isOn;

     public RobotSapper (String model, double powerConsumption, String mineClearance, String material){
         this.model = model;
         this.powerConsumption = powerConsumption;
         this.mineClearance = mineClearance;
         this.material = material;
         this.isOn = false;
     }

    @Override
    public void turnOn() {
         isOn = true;
         System.out.println("Робот-сапёр включён");
    }

    @Override
    public void turnOff() {
         isOn = false;
         System.out.println("Робот-сапёр выключен");
    }

    @Override
    public void uniquePossibility() {
        if (isOn) {
            System.out.println("Робот-сапёр делает свою работу");
        } else {
            System.out.println("Робот-сапёр выключен");
        }
     }

    @Override
    public String createItem() {
         System.out.println("Робот-сапёр создаёт приспособление для разминирования");
        return null;
    }

    @Override
    public void repairRobot() {
         System.out.println("Робот-сапёр отремонтирован");
         System.out.println("------------------------------");
        }
    }


