package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.ArrayList;

public class MinStack155 {
  ArrayList<Integer> stack;
  ArrayList<Integer> minStack;

  public MinStack155() {
    this.stack = new ArrayList<>();
    this.minStack = new ArrayList<>();

  }

  public void push(int val) {
    stack.add(val);
    if (minStack.size() > 0) {
      int minVal = Math.min(val, minStack.get(minStack.size() - 1));
      minStack.add(minVal);
    } else {
      minStack.add(val);
    }
  }

  public void pop() {
    stack.remove(stack.size() - 1);
    minStack.remove(minStack.size() - 1);
  }

  public int top() {
    return stack.get(stack.size() - 1);
  }

  public int getMin() {
    if (minStack.size() > 0) {
      return minStack.get(minStack.size() - 1);
    } else {
      return 0;
    }
  }
}