package com.kraftwerking.datastructuresalgo.leetcode;

public class BinarySearch704 {
  public int binary_search(int l, int r, int[] nums, int target) {
    if (l > r)
      return -1;
    int m = l + (r - l) / 2;

    if (nums[m] == target)
      return m;
    return (nums[m] < target) ? binary_search(m + 1, r, nums, target) : binary_search(l, m - 1, nums, target);
  }

  public int search(int[] nums, int target) {
    return binary_search(0, nums.length - 1, nums, target);
  }

  public static void main(String[] args){
    int[] nums = {-1,0,3,5,9,12};
    BinarySearch704 binarySearch704 = new BinarySearch704();
    int res = binarySearch704.search(nums, 9);
    System.out.println(res);
  }

}