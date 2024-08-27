package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.ArrayList;
import java.util.Collections;

public class MinStack1552 {
  ArrayList<Integer> stack;

  public MinStack1552() {
    this.stack = new ArrayList<>();
  }

  public void push(int val) {
    stack.add(val);
  }

  public void pop() {
    stack.remove(stack.get(stack.size() - 1));
  }

  public int top() {
    return stack.get(stack.size() - 1);
  }

  public int getMin() {
    return Collections.min(stack);

  }
}