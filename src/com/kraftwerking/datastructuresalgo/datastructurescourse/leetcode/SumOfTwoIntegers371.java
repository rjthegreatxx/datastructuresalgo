package com.kraftwerking.datastructuresalgo.datastructurescourse.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SumOfTwoIntegers371 {
  public int getSum(int a, int b) {
    return b==0? a:getSum(a^b, (a&b)<<1); //be careful about the terminating condition;

  }

  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    SumOfTwoIntegers371 sumOfTwoIntegers371 = new SumOfTwoIntegers371();
    int result = sumOfTwoIntegers371.getSum(a, b);
    System.out.println(result);
  }
}