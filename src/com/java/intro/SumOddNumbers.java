package com.java.intro;

import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int interval = Integer.parseInt(input.nextLine());
        int sum = 0;
        for (int i = 0; i < 2 * interval; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.printf("Sum:%d", sum);
    }
}
