package com.kraftwerking.datastructuresalgo.leetcode;

class MissingNumber268 {
//  The basic idea is to use XOR operation. We all know that a^b^b =a, which means two xor operations with the same number will eliminate the number and reveal the original number.
//  In this solution, I apply XOR operation to both the index and value of the array. In a complete array with no missing numbers, the index and value should be perfectly corresponding( nums[index] = index), so in a missing array, what left finally is the missing number.


  public int missingNumber(int[] nums) {

    int xor = 0, i = 0;
    for (i = 0; i < nums.length; i++) {
      xor = xor ^ i ^ nums[i];
    }

    return xor ^ i;

  }

  //nice way w sumMissingNumber268
//  public class Solution {
//    public int missingNumber(int[] nums) {
//      int sum = 0;
//      for(int i = 0; i < nums.length; i++){
//        sum += i;
//        sum -= nums[i];
//      }
//      sum += nums.length;
//      return sum;
//    }
//  }

  public static void main(String[] args) {
    int[] nums = {3, 0, 1};
    MissingNumber268 missingNumber268 = new MissingNumber268();
    int result = missingNumber268.missingNumber(nums);
    System.out.println();
    System.out.println(result);
  }
}

