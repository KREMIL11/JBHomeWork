package com.emil.Homework.LessonTen;

import java.util.Scanner;

public class Main {
static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please type in your preferred array length: ");
	    int[] arr = new int [SCANNER.nextInt()];
        System.out.print("Please type in " + arr.length + " numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = SCANNER.nextInt();
        }
        System.out.println(secondSmallestNumExtractor(arr) + " is the second smallest number goodbye.");
    }

    static int secondSmallestNumExtractor(int[] arr) {
        int smallestNum = Integer.MAX_VALUE;
        int secondSmallestNum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallestNum) {
                secondSmallestNum = smallestNum;
                smallestNum = arr[i];
            } else if (arr[i] < secondSmallestNum && arr[i] != smallestNum) {
                secondSmallestNum = arr[i];
            }

        }
        return  secondSmallestNum;
    }
}
