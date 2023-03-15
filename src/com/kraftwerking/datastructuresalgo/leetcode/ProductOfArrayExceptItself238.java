package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.Arrays;

public class ProductOfArrayExceptItself238 {

  public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] output = new int[n];
    for(int i = 0;i<output.length;i++){
      output[i] = 1;
    }

    int pre = 1;
    int post = 1;

    for(int i = 0;i < nums.length - 1;i++){
     int tmp = nums[i] * pre;
     output[i+1] = tmp;
     pre = tmp;
    }

    for(int i = nums.length - 1;i >= 0;i--){
      System.out.println(nums[i]);
      int tmp = output[i] * post;
      output[i] = tmp;


    }

    return output;
  }

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4};
    ProductOfArrayExceptItself238 productOfArrayExceptItself238 = new ProductOfArrayExceptItself238();
    int[] result = productOfArrayExceptItself238.productExceptSelf(nums);
    System.out.println(Arrays.toString(result));

  }
}