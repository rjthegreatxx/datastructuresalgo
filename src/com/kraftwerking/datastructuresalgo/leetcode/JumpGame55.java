package com.kraftwerking.datastructuresalgo.leetcode;


public class JumpGame55 {

  public boolean canJump(int[] nums) {
    int goal = nums.length - 1;

    for (int i = nums.length - 1; i >= 0; i--) {
      if ((i + nums[i]) >= goal) {
        goal = i;
      }
    }

    if (goal == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    int[] nums = {3, 2, 1, 0, 4};

    JumpGame55 jumpGame55 = new JumpGame55();
    boolean result = jumpGame55.canJump(nums);
    System.out.println(result);

  }
}