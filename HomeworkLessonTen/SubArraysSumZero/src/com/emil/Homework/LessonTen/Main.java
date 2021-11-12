package com.emil.Homework.LessonTen;

import java.util.Scanner;

public class Main {
static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter an array length: ");
	    int[] arr = new int[SCANNER.nextInt()];
        System.out.print("Please enter " + arr.length + " numbers of your choice: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = SCANNER.nextInt();
        }
        System.out.println("There are " + subZeroArrayChecker(arr) + " sub arrays");
    }

    static int subZeroArrayChecker(int[] arr) {
        int howManySubsSumZero = 0;
        int  tempValueStored = 0;
        for (int i = 0; i < arr.length; i++) {
            tempValueStored += arr[i];
            if (tempValueStored == 0) {
                howManySubsSumZero++;
            }
        }

        return howManySubsSumZero;
    }
}