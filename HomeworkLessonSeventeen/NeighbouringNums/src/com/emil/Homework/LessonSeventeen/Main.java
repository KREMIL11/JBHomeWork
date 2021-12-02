package com.emil.Homework.LessonSeventeen;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] someArr = new int[10];
        System.out.println(findSmallestDistance(someArr));
    }

    public static int findSmallestDistance(int[] someArr) {
        arrFiller(someArr);
        int smallestDis = Integer.MAX_VALUE;
        int relevantIndex = 0;
        for (int i = 1; i < someArr.length - 1; i++) {
            int tempHolder = someArr[i] - someArr[i - 1];
            if (someArr[i] - someArr[i - 1] < 0) {
                tempHolder = (someArr[i] - someArr[i - 1]) * -1;
            }
            if (tempHolder < smallestDis) {
                smallestDis = someArr[i] - someArr[i - 1];
                if (smallestDis < 0) {
                    smallestDis *= -1;
                }
                relevantIndex = i - 1;
            }
        }
        return relevantIndex;
    }


    public static void arrFiller(int[] filledArr) {
        Random rnd = new Random();
        for (int i = 0; i < filledArr.length; i++) {
            if (filledArr[i] == 0) {
                filledArr[i] = rnd.nextInt(100);
            }
        }
    }
}
