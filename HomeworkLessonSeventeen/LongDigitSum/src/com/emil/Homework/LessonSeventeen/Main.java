package com.emil.Homework.LessonSeventeen;

public class Main {

    public static void main(String[] args) {
        char[] someCharArr = {'0','1','2','3','4','5','6','7','8','9'};
        System.out.println(sumMyDigits(someCharArr));
    }

    public static long sumMyDigits(char[] randomCharArr) {
        long sumOfNum = 0;
        for (int j : randomCharArr) {
            sumOfNum += j;
        }
        return sumOfNum;
    }
}
