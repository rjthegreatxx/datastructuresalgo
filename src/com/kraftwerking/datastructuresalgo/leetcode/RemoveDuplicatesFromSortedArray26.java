package com.kraftwerking.datastructuresalgo.leetcode;

class RemoveDuplicatesFromSortedArray26 {

  public int removeDuplicates(int[] nums) {
    int k = 1;
    for(int i = k;i< nums.length;i++){
      if(nums[i-1] != nums[i]){
        nums[k] = nums[i];
        k++;
      }

    }
    return k;
  }

  public static void main(String[] args) {
    int[] nums = {1,1,2};

    RemoveDuplicatesFromSortedArray26 removeDuplicatesFromSortedArray26 = new RemoveDuplicatesFromSortedArray26();
    int result = removeDuplicatesFromSortedArray26.removeDuplicates(nums);
    System.out.println(result);
  }
}

