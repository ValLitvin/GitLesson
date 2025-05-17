package by.hw.lessons.hw_20;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class FileGenerator implements Callable<List<String>> {
    private static final Random RANDOM = new Random();  //генерация случайных чисел
    private final int taskId;

    public FileGenerator(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public List<String> call() throws Exception {
        String threadName = Thread.currentThread().getName();   //Получаем имя текущего потока.
        List<String> fileNames = new ArrayList<>(); //Создаём список для хранения имён файлов.
        System.out.printf("Task %d started by %s%n", taskId, threadName);   //Выводим сообщение о старте задачи.

        for (int i = 0; i < 10; i++) {  //В цикле создаём 10 файлов с уникальными именами.
            String fileName = "file_task" + taskId + "_" + i + ".txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (int j = 0; j < 10; j++) {
                    writer.write(generateRandomString(10)); //В каждый файл записываем 10 случайных строк по 10 символов.
                    writer.newLine();
                }
            }
            fileNames.add(fileName);
            System.out.printf("Task %d: %s created by %s%n", taskId, fileName, threadName); //После создания файла выводим сообщение.
        }

        int sleepTime = 1 + RANDOM.nextInt(3); // Генерируем случайное время сна от 1 до 3 секунд.
        System.out.printf("Task %d: %s sleeping for %d seconds%n", taskId, threadName, sleepTime);  //Сообщаем о сне.
        Thread.sleep(sleepTime * 1000); //Засыпаем на это время.

        System.out.printf("Task %d finished by %s%n", taskId, threadName);  //Сообщаем о завершении задачи.
        return fileNames;   //Возвращаем список имён файлов.
    }

    private String generateRandomString(int length) {   //Метод генерации случайной строки
        String chars = "pumpurumpamparamTRATATATvjrnvjnfjefjfj";    //Генерирует строку заданной длины из случайных символов.
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(RANDOM.nextInt(chars.length())));
        }
        return sb.toString();
    }
}
