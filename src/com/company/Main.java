package com.company;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите число: ");
        int number = scanner.nextInt();

        if (number%2==0) System.out.println("четное");
        else System.out.println("нечетное");
    }
}
