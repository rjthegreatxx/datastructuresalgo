package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidParentheses20 {
  public boolean isValid(String s) {
    if(s.isEmpty()) return false;
    List<Character> stack = new ArrayList<>();
    Map<String, String> closeToOpen = new HashMap<>();
    closeToOpen.put("}","{");
    closeToOpen.put("]","[");
    closeToOpen.put(")","(");

    char[] chars = s.toCharArray();
    if(chars.length == 1) return false;
    for(int i = 0;i< chars.length;i++){
      char c = chars[i];
      if(closeToOpen.containsKey(String.valueOf(c))){
        String open = closeToOpen.get(String.valueOf(c));
        String fromStack = String.valueOf(stack.remove(stack.size() - 1));
        if(!open.equals(fromStack)) return false;
      } else {
        if(!closeToOpen.keySet().contains(c)) return false;
        stack.add(c);
      }
    }

    return true;
  }

  public static void main(String[] args) {
    ValidParentheses20 validParentheses20 = new ValidParentheses20();
    boolean result = validParentheses20.isValid("((");
    System.out.println(result);

  }
}