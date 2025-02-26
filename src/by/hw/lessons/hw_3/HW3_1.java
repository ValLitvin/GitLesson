package by.hw.lessons.hw_3;

import java.util.Scanner;

public class HW3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    // 3.
        System.out.println("Введите число x: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double result = 15/x;
        switch ( (int) result){
            case 3:
                System.out.println("Результат деления равен 3");
                break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
            default:
                System.out.println("Результат деления равен дробному числу:" + result);
                break;
        }




    }
}
