package com.kraftwerking.datastructuresalgo.leetcode;


public class MaximumSubarray53 {

  public int maxSubArray(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    int largestSum = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length - 1; i++) {
      int currentSum = 0;
      for (int j = i; j <= nums.length - 1; j++) {
        currentSum = currentSum + nums[j];
        largestSum = Math.max(largestSum, currentSum);
      }
    }

    return largestSum;
  }

  public static void main(String[] args) {
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    MaximumSubarray53 maximumSubarray53 = new MaximumSubarray53();
    int result = maximumSubarray53.maxSubArray(nums);
    System.out.println(result);

  }
}