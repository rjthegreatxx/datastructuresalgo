package com.kraftwerking.datastructuresalgo.leetcode;

import java.util.HashMap;
import java.util.Map;

class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numMap = new HashMap<>();
    int[] res = new int[2];

    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      int compliment = target - num;
      if (numMap.containsValue(compliment)) {
        Integer key = getKeyByValue(numMap, compliment);
        res[0] = i;
        res[1] = key.intValue();
        return res;
      } else {
        numMap.put(i, num);
      }
    }

    return res;
  }

  public static <K, V> K getKeyByValue(Map<K, V> map, V value) {
    for (Map.Entry<K, V> entry : map.entrySet()) {
      if (entry.getValue().equals(value)) {
        return entry.getKey();
      }
    }
    return null;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 7, 11, 15 };
    TwoSum twoSum = new TwoSum();
    int[] result = twoSum.twoSum(nums, 9);

  }
}