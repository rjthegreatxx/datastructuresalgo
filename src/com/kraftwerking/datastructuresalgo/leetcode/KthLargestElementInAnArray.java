package com.kraftwerking.datastructuresalgo.leetcode;


class KthLargestElementInAnArray {

  public int findKthLargest(int[] nums, int k) {
    nums = quicksortT(nums, 0, nums.length - 1);
    int pos = nums.length - k;
    return nums[pos];
  }

  public static int[] quicksortT(int[] arr, int s, int e) {
    if(e-s + 1 <= 1){
      return arr;
    }

    int left = s;
    int pivot = arr[e];

    for(int i = s;i < e;i++){
      if(arr[i] < pivot){
        int tmp = arr[i];
        arr[left] = arr[i];
        arr[i] = tmp;
        left++;
      }
    }

    arr[e] = arr[left];
    arr[left] = pivot;

    quicksortT(arr, s, left - 1);
    quicksortT(arr, left + 1, e);

    return arr;
  }

  public static void main(String[] args) {
    int nums[] = {3,2,1,5,6,4};
    KthLargestElementInAnArray kthLargestElementInAnArray = new KthLargestElementInAnArray();
    int result = kthLargestElementInAnArray.findKthLargest(nums, 2);
    System.out.println(result);
  }
}