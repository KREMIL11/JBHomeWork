package com.emil.Homework.LessonSeventeen;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        isAnagram("funeral", "real fun");
        isAnagram("the morse code", "here come dots");
        isAnagram("elephant", "the plane");
    }

    public static void isAnagram(String s1, String s2) {
        String str1 = s1.replaceAll("\\s", "");
        String str2 = s2.replaceAll("\\s", "");
        boolean isAnagram = true;

        if (str1.length() != str2.length()) {
            isAnagram = false;
        } else {
            char[] arrStr1 = str1.toLowerCase(Locale.ROOT).toCharArray();
            char[] arrStr2 = str2.toLowerCase(Locale.ROOT).toCharArray();
            Arrays.sort(arrStr1);
            Arrays.sort(arrStr2);
            isAnagram = Arrays.equals(arrStr1, arrStr2);
        }

        if (isAnagram) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }
}
