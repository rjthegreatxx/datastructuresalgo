package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.Stack;

public class ValidParentheses20 {
  public boolean isValid(String s) {
    if (s.length() % 2 != 0) return false;
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      if (
              stack.isEmpty() &&
                      (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')
      ) return false; else {
        if (!stack.isEmpty()) {
          if (
                  stack.peek() == '(' && s.charAt(i) == ')'
          ) stack.pop(); else if (
                  stack.peek() == '{' && s.charAt(i) == '}'
          ) stack.pop(); else if (
                  stack.peek() == '[' && s.charAt(i) == ']'
          ) stack.pop(); else stack.add(s.charAt(i));
        } else stack.add(s.charAt(i));
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    ValidParentheses20 validParentheses20 = new ValidParentheses20();
    boolean result = validParentheses20.isValid("[]");
    System.out.println(result);

  }
}