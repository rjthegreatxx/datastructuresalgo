package com.kraftwerking.datastructuresalgo.leetcode;

import java.util.HashMap;

//On2 inefficient
class TwoSum2 {

  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> numMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] == complement) {
          return new int[]{i, j};
        }
      }
    }
    throw new IllegalArgumentException("not found exception!");
  }
}