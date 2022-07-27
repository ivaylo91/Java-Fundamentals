package com.java.intro;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());

        while (number % 2 != 0) {
            System.out.println("Enter even number.");
            number = input.nextInt();
        }
        System.out.printf("The number is:%d", Math.abs(number));


    }
}
