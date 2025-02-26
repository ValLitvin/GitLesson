package by.hw.lessons.hw_3;

import java.util.Scanner;

public class HW3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    // 1.
        System.out.println("Введите число a:");
        int a = in.nextInt();
        System.out.println("Введите число b:");
        int b = in.nextInt();
        System.out.println("Введите число c:");
        int c = in.nextInt();

        if (a % 2 == 0) {
            System.out.println(a + " - чётное число");
        }
        if (b % 2 == 0) {
            System.out.println(b + " - чётное число");
        }
        if (c % 2 == 0) {
            System.out.println(c + " - чётное число");
            }
        System.out.println("-------------");
    //2.
        System.out.println("Введите число y:");
        int y = in.nextInt();
        System.out.println("Введите число z:");
        int z = in.nextInt();
        System.out.println("Введите число x:");
        int x = in.nextInt();

            if (y % 2 == 0 && y % 5 == 0) {
                System.out.println(y + " делится на 2 и 5");
            }
            if (z % 2 == 0 && z % 5 == 0) {
                System.out.println(z + " делится на 2 и 5");
            }
            if (x % 2 == 0 && x % 5 == 0) {
                System.out.println(x + " делится на 2 и 5");
                }
        System.out.println("-------------");





        }
    }
