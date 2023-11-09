package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidParentheses202 {
    public boolean isValid(String s) {
        if(s.isEmpty()) return false;
        List<Character> stack = new ArrayList<>();
        Map<String, String> closeToOpen = new HashMap<>();
        closeToOpen.put("}","{");
        closeToOpen.put("]","[");
        closeToOpen.put(")","(");

        char[] chars = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if(!stack.isEmpty() && closeToOpen.containsKey(String.valueOf(chars[i]))){
                if(String.valueOf(stack.get(stack.size()-1)).equals(closeToOpen.get(String.valueOf(chars[i])))){
                    stack.remove(stack.size()-1);
                } else {
                    return false;
                }
            } else {
                stack.add(chars[i]);
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