package com.kraftwerking.datastructuresalgo.leetcode;

public class BinarySearch704 {
  public int search(int[] nums, int target) {
    int L = 0, R = nums.length - 1;
    int mid;

    while(L<=R){
      mid = (L + R)/2;
      if(target > nums[mid]){
        L = mid + 1;
      } else if (target < nums[mid]){
        R = mid -1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  public static void main(String[] args){
    int[] nums = {-1,0,3,5,9,12};
    BinarySearch704 binarySearch704 = new BinarySearch704();
    binarySearch704.search(nums, 9);
  }

}