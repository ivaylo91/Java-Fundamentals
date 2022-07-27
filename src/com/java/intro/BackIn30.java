package com.java.intro;

import java.util.Scanner;

public class BackIn30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hour = Integer.parseInt(input.nextLine());
        int minutes = Integer.parseInt(input.nextLine()) + 30;
        if (minutes > 59) {
            hour += 1;
            if (hour > 23) {
                hour -= 24;
            }
            minutes -= 60;
        }
        if (minutes < 10) {
            System.out.println(hour + ":" + "0" + minutes);
        } else if (minutes >= 10) {
            System.out.println(hour + ":" + minutes);
        }

    }
}
