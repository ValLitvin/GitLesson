package by.hw.lessons.hw_18.Runnable;

public class Main {
    private static void runTwoCarsInParallel() {
        Thread car1 = new Thread(new AutoRunnable("Машина 1", "36975 K-0", 650));
        Thread car2 = new Thread(new AutoRunnable("Машина 2", "86480 P-9", 400));

        car1.start();
        car2.start();
    }

    private static void runThreeCarsWithJoin() {
        Thread car1 = new Thread(new AutoRunnable("Машина 1", "50236 T-9", 500));
        Thread car2 = new Thread(new AutoRunnable("Машина 2", "30875 F-2", 750));
        Thread car3 = new Thread(new AutoRunnable("Машина 3", "45121 F-5", 500));

        try {
            car1.start();
            car1.join();

            car2.start();
            car3.start();

            car2.join();
            car3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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