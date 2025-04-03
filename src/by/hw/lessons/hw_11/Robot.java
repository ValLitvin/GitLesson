package by.hw.lessons.hw_11;

interface Robot {
    String createItem();

    default void repairRobot() {
        System.out.println("Робот отремонтирован.");
        System.out.println("------------------------------");
    }

    void turnOn();
    void turnOff();
    void uniquePossibility();
}