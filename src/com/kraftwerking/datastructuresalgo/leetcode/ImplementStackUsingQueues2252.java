package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementStackUsingQueues225 {

}

class MyStack {

  Deque<Integer> queue;

  public MyStack() {
    queue = new ArrayDeque<>();
  }

  public void push(int x) {
    queue.push(x);
  }

  public int pop() {
    return queue.pop();
  }

  public int top() {
    return queue.peek();
  }

  public boolean empty() {
    return queue.isEmpty();
  }
}