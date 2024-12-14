package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2172 {

  public boolean containsDuplicate(int[] nums) {
    if (nums.length == 0) return false;
    Set<Integer> ints = new HashSet<>();
    for(int i = 0;i<nums.length;i++){
      if(!ints.contains(nums[i])){
        ints.add(nums[i]);
      } else {
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4};
    ContainsDuplicate2172 containsDuplicate2172 = new ContainsDuplicate2172();
    boolean result = containsDuplicate2172.containsDuplicate(nums);
    System.out.println(result);

  }
}