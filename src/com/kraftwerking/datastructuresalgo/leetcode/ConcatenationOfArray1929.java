package com.kraftwerking.datastructuresalgo.leetcode;


public class ConcatenationOfArray1929 {

  public int[] getConcatenation(int[] nums) {
    int capacity = 2 * nums.length;
    int[] newArray = new int[capacity];

    for(int i = 0;i<nums.length;i++){
      newArray[i] = nums[i];
      newArray[i + nums.length] = nums[i];
    }
    return newArray;
  }

  public static void main(String[] args) {
    int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};

    ConcatenationOfArray1929 concatenationOfArray1929 = new ConcatenationOfArray1929();
    int[] result = concatenationOfArray1929.getConcatenation(nums);
    System.out.println(result);
  }
}