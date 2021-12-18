package com.emil.Homework.LessonTwenty;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        checkMagazine(
                new String[]{"two", "times", "three", "is", "not", "four"},
                new String[]{"two", "times", "two", "is", "four"}
        );
    }

    private static void checkMagazine(String[] m, String[] n) {
        Map<Integer, String> magazine = new HashMap<>();
        Map<Integer, String> note = new HashMap<>();
        boolean[] isWordInMag = new boolean[n.length];
        for (int i = 0; i < m.length; i++) {
            magazine.put(i, m[i]);
            if (i < n.length) {
                note.put(i, n[i]);
            }
        }
        for (int i = 0; i < n.length; i++) {
            String s1 = note.get(i);
            if (magazine.containsValue(s1)) {
                 magazine.remove(i, s1);
                 isWordInMag[i] = true;
            }
            if (!isWordInMag[i]) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}