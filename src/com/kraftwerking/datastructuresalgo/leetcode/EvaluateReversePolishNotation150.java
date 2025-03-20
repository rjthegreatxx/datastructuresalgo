package com.kraftwerking.datastructuresalgo.leetcode;

import java.util.Stack;

class EvaluateReversePolishNotation150 {

  public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();
    for (String c : tokens) {
      if (c.equals("+")) {
        stack.push(stack.pop() + stack.pop());
      } else if (c.equals("-")) {
        int a = stack.pop();
        int b = stack.pop();
        stack.push(b - a);
      } else if (c.equals("*")) {
        stack.push(stack.pop() * stack.pop());
      } else if (c.equals("/")) {
        int a = stack.pop();
        int b = stack.pop();
        stack.push(b / a);
      } else {
        stack.push(Integer.parseInt(c));
      }
    }
    return stack.pop();
  }

  public static void main(String[] args) {
    EvaluateReversePolishNotation150 evaluateReversePolishNotation150 = new EvaluateReversePolishNotation150();
    int[] nums = { 1, 2, 3 };
    int target = 4;
    int result = evaluateReversePolishNotation150.combinationSum4(nums, target);
    System.out.println(result);
  }
}