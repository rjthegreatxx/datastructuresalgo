package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.Arrays;

public class ProductOfArrayExceptItself2382 {

  public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] output = new int[n];
    output[0] = 1;

    for (int i = 1; i < n; i++) {
      output[i] = nums[i - 1] * output[i - 1];
    }

    int r = 1;
    for (int i = n - 1; i >= 0; i--) {
      output[i] = output[i] * r;
      r = r * nums[i];
    }

    return output;
  }

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4};
    ProductOfArrayExceptItself2382 productOfArrayExceptItself238 = new ProductOfArrayExceptItself2382();
    int[] result = productOfArrayExceptItself238.productExceptSelf(nums);
    System.out.println(Arrays.toString(result));

  }
}