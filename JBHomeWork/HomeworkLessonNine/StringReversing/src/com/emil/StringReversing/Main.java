package com.emil.StringReversing;

import java.util.Scanner;

public class Main {

    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter a string: ");
        String originString = SCANNER.nextLine();
        StringBuilder reversedString = new StringBuilder();
        for (int i = originString.length() - 1; i >= 0; i--) {
            reversedString.append(originString.charAt(i));
        }
        System.out.println(reversedString);
    }
}
