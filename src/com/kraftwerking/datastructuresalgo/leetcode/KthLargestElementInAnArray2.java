package com.kraftwerking.datastructuresalgo.leetcode;


class KthLargestElementInAnArray2 {

  public int findKthLargest(int[] nums, int k) {
    quickSort(nums, 0, nums.length - 1);
    int pos = nums.length - k;
    return nums[pos];
  }

  public static int[] quickSort(int[] arr, int s, int e) {
    if (e - s + 1 <= 1) {
      return arr;
    }

    int pivot = arr[e];
    int left = s;       // pointer for left side

    // Partition: elements smaller than pivot on left side
    for (int i = s; i < e; i++) {
      if (arr[i] < pivot) {
        int tmp = arr[left];
        arr[left] = arr[i];
        arr[i] = tmp;
        left++;
      }
    }

    // Move pivot in-between left & right sides
    arr[e] = arr[left];
    arr[left] = pivot;

    // Quick sort left side
    quickSort(arr, s, left - 1);

    // Quick sort right side
    quickSort(arr, left + 1, e);

    return arr;
  }

  public static void main(String[] args) {
    int nums[] = {3,2,1,5,6,4};
    KthLargestElementInAnArray2 kthLargestElementInAnArray = new KthLargestElementInAnArray2();
    int result = kthLargestElementInAnArray.findKthLargest(nums, 2);
    System.out.println(result);
  }
}