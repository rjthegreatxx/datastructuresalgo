package com.kraftwerking.datastructuresalgo.leetcode;

public class BinarySearch704 {
  public int search(int[] nums, int target) {
    int l = 0;
    int r = nums.length - 1;

    while(l <= r){
      int mid = (r + l) / 2;

      if(target > nums[mid]){
        l = mid + 1;
      }else if(target < nums[mid]){
        r = mid - 1;
      } else {
        return mid;
      }
    }

    return -1;
  }

  public static void main(String[] args){
    int[] nums = {-1,0,3,5,9,12};
    BinarySearch704 binarySearch704 = new BinarySearch704();
    int res = binarySearch704.search(nums, 9);
    System.out.println(res);
  }

}