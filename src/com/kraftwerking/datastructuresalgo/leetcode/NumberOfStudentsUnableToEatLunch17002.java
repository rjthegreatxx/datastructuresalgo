package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.HashMap;
import java.util.Map;

public class NumberOfStudentsUnableToEatLunch17002 {
    public int countStudents(int[] students, int[] sandwiches) {
        int res = students.length;
        Map<Integer, Integer> cnt = new HashMap<>();
        for (Integer student : students) {
            cnt.put(student, cnt.getOrDefault(student, 0) + 1);
        }

        for (int s : sandwiches) {
            if (cnt.getOrDefault(s, 0) > 0) {
                res -= 1;
                cnt.put(s, cnt.get(s) - 1);
            } else {
                return res;
            }
        }
        return res;
    }
}