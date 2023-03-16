package com.kraftwerking.datastructuresalgo.leetcode;

class ReorderList143 {

  public int removeElement(int[] nums, int val) {
    int k = 0;
    for(int i = k;i< nums.length;i++){
      if(nums[i] != val){
        nums[k] = nums[i];
        k++;
        }

    }
    return k;
  }

}

