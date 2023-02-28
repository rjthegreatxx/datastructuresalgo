package com.kraftwerking.datastructuresalgo.leetcode;


public class MinimumInRotatedSortedArray153 {

  public int findMin(int[] nums) {
    int low = 0;
    int high = nums.length - 1;
    while (low < high) {
      int mid = (low + high) / 2;
      if (nums[mid] < nums[high]) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }

    return nums[low];
  }

  public static void main(String[] args) {
    int[] nums = {3, 4, 5, 1, 2};
    MinimumInRotatedSortedArray153 minimumInRotatedSortedArray153 = new MinimumInRotatedSortedArray153();
    int result = minimumInRotatedSortedArray153.findMin(nums);
    System.out.println(result);
  }
}