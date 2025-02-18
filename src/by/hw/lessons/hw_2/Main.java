package by.hw.lessons.hw_2;

import java.nio.file.FileSystemNotFoundException;

public class Main {

    public static void main(String[] args) {

         int x = (98-25)*6;

         System.out.println("x = " + x);

    System.out.println( "**********************" );


        int X = 3;
        X+=5;   // x=x+5
        System.out.println("X = " + X);
    System.out.println( "***" );

        int Y = 1;
        Y*=9;   //y=y*9
        System.out.println("Y = " + Y);
    System.out.println( "***" );

        int Z = 18;
        Z-=6;    //z=z-6
        System.out.println("Z = " + Z);

    System.out.println( "**********************" );

        int a = 35;
        int b = 65;
        int c = a > b ? 5:10;

        System.out.printf("c = " + c);

    System.out.println( "**********************" );

        int d = 5;
        int e = 2;
        int f = ++d*e;

        System.out.printf("f = " + f);
    }
}