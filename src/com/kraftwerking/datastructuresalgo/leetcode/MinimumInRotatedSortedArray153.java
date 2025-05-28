package com.kraftwerking.datastructuresalgo.leetcode;


public class MinimumInRotatedSortedArray153 {

  public int findMin(int[] nums) {
    int l = 0;
    int r = nums.length - 1;
    int res = nums[0];

    while (l <= r) {
        if (nums[l] < nums[r]) {
            res = Math.min(res, nums[l]);
            break;
        }

        int m = l + (r - l) / 2;
        res = Math.min(res, nums[m]);
        if (nums[m] >= nums[l]) {
            l = m + 1;
        } else {
            r = m - 1;
        }
    }
    return res;
}

  public static void main(String[] args) {
    int[] nums = {3, 4, 5, 1, 2};
    MinimumInRotatedSortedArray153 minimumInRotatedSortedArray153 = new MinimumInRotatedSortedArray153();
    int result = minimumInRotatedSortedArray153.findMin(nums);
    System.out.println(result);
  }
}