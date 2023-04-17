package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.ArrayList;
import java.util.List;

public class PancakeSorting969 {

  public List<Integer> pancakeSort(int[] A) {
    List<Integer> result = new ArrayList<>();
    int len = A.length;
    //len is the total elements in the current array which are unsorted
    //through each iteration of while loop, we try to set the current max element to the len-1 position
    //and also decrease len by 1
    while(len>1) {
      int max = A[0], index=0;
      //find the index of the max element in current unsorted part of the array; up to len
      for(int i=0; i<len; i++) {
        if(A[i]>max) {
          max = A[i];
          index = i;
        }
      }


      //if max is at last position, no need to do any flips
      if(index==len-1) {
        len--;
        continue;
      }

      //reverse the string till max index so max comes to the front
      result.add(index+1);
      reverse(A, index+1);
      //then reverse it till size of the current unsorted array
      result.add(len);
      reverse(A, len);
      len--;
    }

    return result;
  }

  public void reverse(int[] A, int len) {
    int left=0, right=len-1;
    while(left<right) {
      int temp = A[left];
      A[left++] = A[right];
      A[right--] = temp;
    }
  }

  public static void main(String[] args) {
    int[] arr = {3,2,4,1};
    PancakeSorting969 pancakeSorting969 = new PancakeSorting969();
    pancakeSorting969.pancakeSort(arr);

  }
}