package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.Arrays;

class HouseRobber2213 {

  public int rob(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }

    int[] nums1 = Arrays.copyOfRange(nums, 0, nums.length - 1);
    int[] nums2 = Arrays.copyOfRange(nums, 1, nums.length);

    return Math.max(helper(nums1), helper(nums2));
  }

  private int helper(int[] nums) {
    int rob1 = 0;
    int rob2 = 0;

    for (int n : nums) {
      int temp = Math.max(n + rob1, rob2);
      rob1 = rob2;
      rob2 = temp;
    }

    return rob2;
  }

  public static void main(String[] args) {
    HouseRobber2213 houseRobber198 = new HouseRobber2213();
    int[] nums = {1, 2, 3, 1};
    int result = houseRobber198.rob(nums);
    System.out.println(result);
  }
}