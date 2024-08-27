package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.ArrayList;
import java.util.HashMap;

public class ValidParentheses202 {
    public boolean isValid(String s) {
        if(s.isEmpty()) return false;
        char[] chars = s.toCharArray();
        HashMap<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(']', '[');
        closeToOpen.put(')', '(');
        closeToOpen.put('}', '{');
        ArrayList<Character> stack = new ArrayList<>();
        for(int i = 0;i < chars.length; i++){
            if(!stack.isEmpty() && closeToOpen.containsKey(chars[i])){
                if(closeToOpen.get(chars[i]).equals(stack.get(i-1))){
                    stack.remove(i-1);
                }

            } else {
                stack.add(chars[i]);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses202 validParentheses20 = new ValidParentheses202();
        boolean result = validParentheses20.isValid("[]");
        System.out.println(result);

    }
}