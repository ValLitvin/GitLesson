package by.hw.lessons.hw_20;

import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<List<String>>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            futures.add(executor.submit(new FileGenerator(i)));
        }

        for (int i = 0; i < futures.size(); i++) {
            List<String> files = futures.get(i).get();
            System.out.printf("Result of task %d: %s%n", i, files);
        }

        executor.shutdown();
    }
}