package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidParentheses202 {
    public boolean isValid(String s) {
        ArrayList<String> stack = new ArrayList<>();
        Map<String, String> closeToOpen = new HashMap<String, String>() {{
            put(")", "(");
            put("]", "]");
            put("}", "{");
        }};

        for (char ch : s.toCharArray()) {
            if(closeToOpen.containsKey(String.valueOf(ch))

        }

        return false;
    }

    public static void main(String[] args) {
        ValidParentheses202 validParentheses20 = new ValidParentheses202();
        boolean result = validParentheses20.isValid("((");
        System.out.println(result);

    }
}