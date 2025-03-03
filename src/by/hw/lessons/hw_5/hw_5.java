package by.hw.lessons.hw_5;

import java.util.Scanner;

public class hw_5 {

    public static void main(String[] args) {

    // 1.
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 3 == 0) {
                System.out.println(i);

            }
        }
    System.out.println("---------------------");

    //2.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое положительное число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе положительное число: ");
        int num2 = scanner.nextInt();

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        int sum = 0;
        int current = min;

        while (current <= max) {
            sum += current;
            current++;
        }
        System.out.println("Сумма всех чисел от " + min + " до " + max + " равна: " + sum);
        System.out.println("---------------------");

    // 3.
    }
}
