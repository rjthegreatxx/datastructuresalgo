package com.kraftwerking.datastructuresalgo.leetcode;

class RemoveElement27 {

  public int removeElement(int[] nums, int val) {
    int k = 0;
    for(int i = k;i < nums.length;i++){
      if(nums[i] != val){
        nums[k] = nums[i];
        k++;
      }
    }
    return k;
  }

  public static void main(String[] args) {
    int[] nums = {0,1,2,2,3,0,4,2};

    RemoveElement27 removeElement27 = new RemoveElement27();
    int result = removeElement27.removeElement(nums, 2);
    System.out.println(result);
  }
}

