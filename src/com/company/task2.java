package com.company;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        //задание 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число: ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.print("Понедельник");
                break;
            case 2:
                System.out.print("Вторник");
                break;
            case 3:
                System.out.print("среда");
                break;
            case 4:
                System.out.print("Четверг");
                break;
            case 5:
                System.out.print("Пятница");
                break;
            case 6:
                System.out.print("Суббота");
                break;
            case 7:
                System.out.print("Воскресенье");
                break;
            default:
                System.out.print(" Некорректное число.Введите число от 1 до 7");
                break;
        }
    }
}
