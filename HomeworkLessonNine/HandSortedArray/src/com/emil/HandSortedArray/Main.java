package com.emil.HandSortedArray;

import java.util.Scanner;

public class Main {
    static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int tempNumHolder;
        System.out.print("Please type an array length: ");
	    int[] ogArrayOrder = new int[SCANNER.nextInt()];
        System.out.print("Now type a number: ");
        ogArrayOrder[0] = SCANNER.nextInt();
        for (int i = 1; i < ogArrayOrder.length; i++) {
            System.out.print("Another: ");
            ogArrayOrder[i] = SCANNER.nextInt();
        }
        for (int i = 0; i < ogArrayOrder.length; i++) {
            for (int j = i + 1; j < ogArrayOrder.length; j++) {
                if (ogArrayOrder[i] > ogArrayOrder[j]) {
                    tempNumHolder = ogArrayOrder[i];
                    ogArrayOrder[i] = ogArrayOrder[j];
                    ogArrayOrder[j] = tempNumHolder;
                }
            }
        }
        for (int i = 0; i < ogArrayOrder.length; i++) {
            System.out.print(ogArrayOrder[i] + " ");
        }
    }
}