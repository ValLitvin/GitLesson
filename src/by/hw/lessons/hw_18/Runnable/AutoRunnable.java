package by.hw.lessons.hw_18.Runnable;

public class AutoRunnable implements Runnable {
    private final String name;
    private final String stateNumber;
    private final int stopTime;

    public AutoRunnable(String name, String stateNumber, int stopTime) {
        this.name = name;
        this.stateNumber = stateNumber;
        this.stopTime = stopTime;
    }

    @Override
    public void run() {
        drive();
    }

    private void drive() {
        System.out.println(name + " с номером " + stateNumber + " начинает движение.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " едет... шаг " + i);
            try {
                Thread.sleep(stopTime);
            } catch (InterruptedException e) {
                System.out.println(name + " был прерван.");
                return;
            }
        }
        System.out.println(name + " закончил движение.");
    }
}