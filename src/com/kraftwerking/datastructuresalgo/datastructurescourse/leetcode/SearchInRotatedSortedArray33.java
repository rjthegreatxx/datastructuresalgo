package com.kraftwerking.datastructuresalgo.datastructurescourse.leetcode;


public class SearchInRotatedSortedArray33 {

  public int search(int[] nums, int target) {
    if(nums == null || nums.length == 0) {
      return -1;
    }

    //binary search to find where array is shifted, pivot point
    int left = 0;
    int right = nums.length -1;
    while(left < right){
      int mid = left + (right - left)/2;
      if(nums[mid] > nums[right]){
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    int realmid = left;
    left = 0;
    right = nums.length - 1;

    //search to r or l side of realmid?
    if(target >= nums[realmid] && target <= nums[right]){
      left = realmid;
    } else {
      right = realmid;
    }

    while(left <= right){
      int mid = left + (right - left)/2;
      if(nums[mid] == target){
        return mid;
      } else if (nums[mid] < target){
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    
    return -1;
  }

  public static void main(String[] args) {
    int[] nums = {4,5,6,7,9,1,2};
    int target = 0;
    SearchInRotatedSortedArray33 searchInRotatedSortedArray33 = new SearchInRotatedSortedArray33();
    int result = searchInRotatedSortedArray33.search(nums, target);
    System.out.println(result);
  }
}