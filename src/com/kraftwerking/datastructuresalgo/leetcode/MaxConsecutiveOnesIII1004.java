package com.kraftwerking.datastructuresalgo.leetcode;

class MaxConsecutiveOnesIII1004 {

  public int longestOnes(int[] nums, int k) {
    int l = 0;
    int r = 0;

    while(l < nums.length){
      if(nums[l] == 0) k--;
      if(k<0){
        if(nums[r] == 0){
          k++;
        }
        r++;
      }
      l++;

    }

    return l-r;
  }

  public static void main(String[] args) {
    int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
    MaxConsecutiveOnesIII1004 maxConsecutiveOnesIII1004 = new MaxConsecutiveOnesIII1004();
    int result = maxConsecutiveOnesIII1004.longestOnes(nums, 3);
    System.out.println(result);
  }
}