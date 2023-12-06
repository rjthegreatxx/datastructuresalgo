package com.kraftwerking.datastructuresalgo.leetcode;

class SortAnArray9122 {

  //insertion sort
  public int[] sortArray(int[] nums) {

    for(int i = 1;i<nums.length;i++){
      int j = i-1;
      while(j>=0 && nums[j+1] < nums[j]){
        int tmp = nums[j];
        nums[j] = nums[j+1];
        nums[j+1] = tmp;
        j--;
      }
    }
    return nums;
  }

  public static void main(String[] args) {
    int[] nums = {2,0,2,1,1,0};
    SortAnArray9122 sortAnArray912 = new SortAnArray9122();
  }
}