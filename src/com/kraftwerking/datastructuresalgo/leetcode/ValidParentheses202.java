package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses202 {
    public boolean isValid(String s) {
        if (s.isEmpty())
            return false;

        Map<Character, Character> charMap = new HashMap<>();
        charMap.put(']', '[');
        charMap.put('}', '{');
        charMap.put(')', '(');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (charMap.containsKey(currentChar)) {
                // Check if the stack is empty or the top of the stack is not the matching
                // opening bracket
                if (stack.isEmpty() || stack.pop() != charMap.get(currentChar)) {
                    return false;
                }
            } else {
                stack.push(currentChar);
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