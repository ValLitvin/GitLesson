package by.hw.lessons.hw_18;

public class Main {

    private static void runTwoCarsInParallel() {
        Auto car1 = new Auto("Машина 1", "58974 K-6", 600);
        Auto car2 = new Auto("Машина 2", "30147 L-0", 900);

        car1.start();
        car2.start();
    }

    private static void runThreeCarsWithJoin() {
        Auto car1 = new Auto("Машина 1", "78320 D-8", 550);
        Auto car2 = new Auto("Машина 2", "30698 K-3", 600);
        Auto car3 = new Auto("Машина 3", "47520 H-5", 800);

        car1.start();
        car1.join();

        car2.start();
        car3.start();

        car2.join();
        car3.join();
    }

    public static void main(String[] args) {
        runTwoCarsInParallel();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        runThreeCarsWithJoin();
    }
}