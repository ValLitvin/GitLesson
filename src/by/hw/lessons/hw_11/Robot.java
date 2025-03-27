package by.hw.lessons.hw_11;

interface Robot {
    String createItem();

    default void repairRobot() {
        System.out.println("Робот отремонтирован.");
    }

    void turnOn();

    void turnOff();

    void uniquePossibility();
}
