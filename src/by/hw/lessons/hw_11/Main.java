package by.hw.lessons.hw_11;

public class Main {
    private static RobotEngineer[] engineers;

    public static void main (String[] args){
        RobotCooker cook = new RobotCooker("MasterCook-25", 750, "Japan", "Комбаин") {
            @Override
            public String createItem() {
                return "";
            }
        };
        RobotSapper sapper = new RobotSapper("RobSapper", 300, "Chassis-2.3", "Plastic");
        RobotBuilder builder = new RobotBuilder("NewBuilder", 1000, "Russia", "Crane", "Metal");

        cook.repairRobot();
        sapper.repairRobot();
        builder.repairRobot();

        Robot[] allRobots = {cook, sapper, builder};
        RobotSapper[] deminers = {sapper};

        System.out.println("Выставка всех роботов:");
        for (Robot robot : allRobots) {
            robot.turnOn();
            robot.uniquePossibility();
            robot.turnOff();
        }

        System.out.println("Выставка роботов-инженеров:");
        for (RobotEngineer engineer : engineers) {
            engineer.turnOn();
            engineer.uniquePossibility();
            engineer.createItem();
            engineer.turnOff();
        }

        System.out.println("Выставка роботов-сапёров:");
        for (RobotSapper sapperRobot : deminers) {
            sapperRobot.turnOn();
            sapperRobot.uniquePossibility();
            sapperRobot.createItem();
            sapperRobot.turnOff();
        }
    }
}
