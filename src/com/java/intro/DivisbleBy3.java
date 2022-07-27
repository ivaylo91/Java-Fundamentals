package com.java.intro;

public class DivisbleBy3 {
    public static void main(String[] args) {
        System.out.println(printNumbers(3, 100));
    }

    public static String printNumbers(int startInterval, int endInterval) {
        int number = 0;
        String numbers = " ";
        for (int i = startInterval; i <= endInterval; i += 3) {
            number = i;
            numbers += number + "\n";
        }
        return numbers;
    }
}
