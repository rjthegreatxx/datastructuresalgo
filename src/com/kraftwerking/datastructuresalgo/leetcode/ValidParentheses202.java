package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParentheses202 {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        List<Character> stack = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')) {
                return false;
            } else {
                if (!stack.isEmpty()) {
                    if (stack.get(stack.size()-1) == '(' && s.charAt(i) == ')') {
                        stack.remove(stack.size()-1);
                    } else if (stack.get(stack.size()-1) == '{' && s.charAt(i) == '}') {
                        stack.remove(stack.size()-1);
                    } else if (stack.get(stack.size()-1) == '[' && s.charAt(i) == ']') {
                        stack.remove(stack.size()-1);
                    } else stack.add(s.charAt(i));
                } else stack.add(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses202 validParentheses20 = new ValidParentheses202();
        boolean result = validParentheses20.isValid("((");
        System.out.println(result);

    }
}