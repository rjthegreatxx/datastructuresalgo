package com.kraftwerking.datastructuresalgo.leetcode;


public class FibonacciNumber509 {
  public int fib(int n) {

    if(n <=1){
      return n;
    }
    return fib(n-1) + fib(n-2);
  }

  public static void main(String[] args) {
    FibonacciNumber509 fibonacciNumber509 = new FibonacciNumber509();
    int result = fibonacciNumber509.fib(2);
    System.out.println(result);

  }
}