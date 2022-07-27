package com.java.intro;

import java.util.Scanner;

public class MonthPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = Integer.parseInt(input.nextLine());

        String[] months = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };
        String printMonth = " ";

        for (int i = 0; i < months.length - 1; i++) {
            printMonth = months[i] = months[month - 1];
        }

        System.out.println(printMonth);
    }
}
