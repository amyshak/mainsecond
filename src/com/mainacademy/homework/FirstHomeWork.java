package com.mainacademy.homework;

import java.util.Scanner;

/**
 * Created by user on 30.07.2017.
 */
public class FirstHomeWork {
    public static void main(String[] args) {
        // Вывод на экран переменной name

            String name = "In cats we trust";
            System.out.println(name);


            //  Написать программу, которая считывает с клавиатуры целое число a и выводит квадрат этого числа

        int a;
            Scanner scNumber = new Scanner(System.in);
            System.out.println("Введите число");
            a = scNumber.nextInt();
            System.out.println("Квадрат числа=" + a * a);







        }
    }















