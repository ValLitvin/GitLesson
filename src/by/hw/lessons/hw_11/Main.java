package by.hw.lessons.hw_11;

public class Main {

    public static void main (String[] args){
        RobotCooker cooker = new RobotCooker("MasterCook-25",750,"Japan","Mixer");
        RobotSapper sapper = new RobotSapper("RobSapper", 300, "Chassis-2.3", "Plastic");
        RobotBuilder builder = new RobotBuilder("NewBuilder", 1000, "Russia", "Crane", "Metal");

        cooker.repairRobot();
        sapper.repairRobot();
        builder.repairRobot();

        Robot[] allRobots = {cooker, sapper, builder};
        RobotEngineer[] engineers = {sapper, builder};
        RobotSapper[] deminers = {sapper};

        System.out.println("------------------------------");
        System.out.println("Выставка всех роботов:");
        for (Robot robot : allRobots) {
            robot.turnOn();
            robot.uniquePossibility();
            robot.turnOff();
        }
        System.out.println("------------------------------");
        System.out.println("Выставка роботов-инженеров:");
        for (RobotEngineer engineer : engineers) {
            engineer.turnOn();
            engineer.uniquePossibility();
            engineer.createItem();
            engineer.turnOff();
        }
        System.out.println("------------------------------");
        System.out.println("Выставка роботов-сапёров:");
        for (RobotSapper sapperRobot : deminers) {
            sapperRobot.turnOn();
            sapperRobot.uniquePossibility();
            sapperRobot.createItem();
            sapperRobot.turnOff();
        }
    }
}