package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses202 {
    public boolean isValid(String s) {
        if(s.isEmpty()) return false;

        Map<Character, Character> charMap = new HashMap<>();
        charMap.put(']', '[');
        charMap.put('}', '{');
        charMap.put(')', '(');

        ArrayList<Character> stack = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && charMap.containsKey(s.charAt(i))) {
                if (charMap.get(s.charAt(i)) == s.charAt(i - 1)) {
                    stack.remove(i-1);

                }
            } else {
                stack.add(s.charAt(i));
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses202 validParentheses20 = new ValidParentheses202();
        boolean result = validParentheses20.isValid("([{}])");
        System.out.println(result);

    }
}