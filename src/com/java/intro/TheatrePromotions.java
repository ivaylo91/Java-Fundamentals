package com.java.intro;

import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String typeOfDay = input.nextLine().toLowerCase();
        int age = Integer.parseInt(input.nextLine());
        double price = 0.0;

        if (typeOfDay.equals("weekday")) {
            if (age >= 0 && age <= 18 || age > 64 && age <= 122) {
                price = 12;
            } else if (age > 18 && age <= 64) {
                price = 18;
            }
        } else if (typeOfDay.equals("weekend")) {
            if (age >= 0 && age <= 18 || age > 64 && age <= 122) {
                price = 15;
            } else if (age > 18 && age <= 64) {
                price = 20;
            }
        } else if (typeOfDay.equals("holiday")) {
            if (age >= 0 && age <= 18) {
                price = 5;
            } else if (age > 18 && age <= 64) {
                price = 12;
            } else if (age > 64 && age <= 122) {
                price = 10;
            }
        }
        if (price != 0) {
            System.out.printf("%.2f$", price);
        } else {
            System.out.println("Error");
        }
    }
}
