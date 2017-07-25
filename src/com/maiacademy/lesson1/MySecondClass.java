package com.maiacademy.lesson1;

/**
 * Created by user on 25.07.2017.
 */
public class MySecondClass {

    public static void main(String[] arg) {

        int a = 6;
        System.out.println("Площадь квадрата = " + a * a);


        int b = 4;
        int c = 2;
        System.out.println("Площадь прямоугольника = " + b * c);

        int x = 10;
        int y = 20;

        if ((y - x) > 10) {
            String S1 = "y-x не больше 10";
            System.out.println("S1");
        } else if ((y - x) == 0) {
            String S2 = "y-x не равно 0";
            System.out.println("S2");
        } else {
            String S3 = "y-x равно 0";
            System.out.println("S3");
        }
    }
}



