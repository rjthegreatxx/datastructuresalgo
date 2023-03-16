package com.kraftwerking.datastructuresalgo.leetcode;

import java.util.HashMap;
import java.util.Map;

class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numMap = new HashMap<>();
    int[] res = new int[2];

    for(int i = 0;i<nums.length;i++){
      int num = nums[i];
      int complement = target - num;

      if(numMap.containsKey(complement)){
        res[0] = i;
        res[1] = numMap.get(complement);
        return res;
      } else {
        numMap.put(num, i);
      }

    }

    return res;
  }

  public static void main(String[] args){
    int[] nums = {2,7,11,15};
    TwoSum twoSum = new TwoSum();
    int[] result = twoSum.twoSum(nums, 9);

  }
}