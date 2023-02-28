package com.kraftwerking.datastructuresalgo.leetcode;

class SortColors75 {
  public void sortColors(int[] nums) {
    int[] counts = {0,0,0};
    for(int i = 0;i<nums.length;i++){
      counts[nums[i]] = counts[nums[i]] +  1;
    }

    int i = 0;
    for (int n = 0; n < counts.length; n++) {
      for (int j = 0; j < counts[n]; j++) {
        nums[i] = n;
        i++;
      }
    }

  }

  public static void main(String[] args) {
    int[] nums = {2,0,2,1,1,0};
    SortColors75 sortColors75 = new SortColors75();
    sortColors75.sortColors(nums);
  }
}