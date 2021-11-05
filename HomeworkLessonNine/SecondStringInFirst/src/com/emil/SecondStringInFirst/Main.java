package com.emil.SecondStringInFirst;

import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please type in a string: ");
        final String firstString = SCANNER.nextLine();
        System.out.print("Please type in another string: ");
        final String secondString = SCANNER.nextLine();
        StringBuilder tempHolder = new StringBuilder();
        int untilStop = Math.min(firstString.length(), secondString.length());
        for (int i = 0, j = 0; i < untilStop; i++) {
                if (firstString.charAt(i) == secondString.charAt(j)) {
                    tempHolder.append(secondString.charAt(j));
                    j++;
                    }
        }
        System.out.println(tempHolder.toString().equals(secondString));
    }
}
