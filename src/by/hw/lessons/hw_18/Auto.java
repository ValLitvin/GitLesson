package by.hw.lessons.hw_18;

public class Auto {
    private String name;
    private String stateNumber;
    private int stopTime;

    public Auto(String name, String stateNumber, int stopTime) {
        this.name = name;
        this.stateNumber = stateNumber;
        this.stopTime = stopTime;
    }

    public void drive() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " is driving...");
            try {
                Thread.sleep(stopTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start() {
    }

    public void join() {
    }
}