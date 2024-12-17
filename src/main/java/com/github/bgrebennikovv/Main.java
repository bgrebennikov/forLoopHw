package com.github.bgrebennikovv;

public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println("Числа от 1 до 10");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        // Task 2
        System.out.println("Числа от 10 до 1");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // Task 3
        System.out.println("Четные числа");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0 & i != 0) {
                System.out.println(i);
            }
        }

        // Task 4
        System.out.println("Числа от 10 до −10 ");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // Task 5
        int fromYear = 1904;
        int toYear = 2096;
        System.out.printf("Високосные года с %s по %s \n", fromYear, toYear);

        for (int i = fromYear; i < toYear; i += 4) {
            System.out.printf("%s год является високосным\n", i);
        }

        // Task 6
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        // Task 7
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        // Task 8
        int deposit = 29000;
        System.out.printf("\nЕжемесячный вклад: %s \n", deposit);
        for (int i = 1; i <= 12; i++) {
            System.out.printf("""
                    Месяц %s, сумма накоплений равна %s рублей
                    """, i, deposit * i
            );
        }

        // Task 9
        System.out.println("\nРасчет со ставкой 12% годовых: \n");

        for (int i = 1; i <= 12; i++) {
            System.out.printf("""
                    Месяц %s, сумма накоплений равна %s рублей
                    """, i, (deposit * i) * 1.01
            );
        }

        // Task 10
        System.out.println("\nТаблица умножения на 2: \n");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("""
                    2*%s=%s
                    """, i, 2 * i);
        }

    }
}