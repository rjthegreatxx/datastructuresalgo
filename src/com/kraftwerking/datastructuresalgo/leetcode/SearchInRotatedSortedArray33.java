package com.kraftwerking.datastructuresalgo.leetcode;


public class SearchInRotatedSortedArray33 {

  public int search(int[] nums, int target) {
    int l = 0;
    int r = nums.length - 1;

    while (l <= r) {

      int mid = (l + r) / 2;

      if (nums[mid] == target) {
        return mid;
      }

        if (nums[l] <= nums[mid]) {
          if (target > nums[mid] || target < nums[l]) {
            l = mid + 1;
          } else {
              r = mid - 1;
            }
          } else {
          if (target < nums[mid] || target > nums[r]) {
            r = mid - 1;
          } else {
            l = mid + 1;
          }
        }

    }

    return -1;
  }

  public static void main(String[] args) {
    int[] nums = {4, 5, 6, 7, 9, 1, 2};
    int target = 0;
    SearchInRotatedSortedArray33 searchInRotatedSortedArray33 = new SearchInRotatedSortedArray33();
    int result = searchInRotatedSortedArray33.search(nums, target);
    System.out.println(result);
  }
}