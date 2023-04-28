package com.kraftwerking.datastructuresalgo.leetcode;


public class FindMinimumInRotatedSortedArray153 {
  public int findMin(int[] nums) {
    int L = 0;
    int R = nums.length - 1;
    int mid;

    while(L<R){
      mid = (L + R) / 2;
      if(nums[mid] < nums[R]){
        R = mid;
      } else {
        L = mid + 1;
      }
    }

    return nums[L];
  }

  public static void main(String[] args) {
    int[] nums  = {11,13,15,17};
    FindMinimumInRotatedSortedArray153 findMinimumInRotatedSortedArray153 = new FindMinimumInRotatedSortedArray153();
    int result = findMinimumInRotatedSortedArray153.findMin(nums);
    System.out.println(result);

  }
}