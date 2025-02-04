package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.HashSet;

class LongestConsecutiveSequence128 {

  public int longestConsecutive(int[] nums) {
    HashSet<Integer> numSet = new HashSet<>();
    for (Integer n : nums) {
      numSet.add(n);
    }
    int longest = 0;

    for(int i = 0;i<nums.length;i++){
      if(!numSet.contains(nums[i] - 1)){ // start of a new sequence
        int len = 0;
        int curr = nums[i];

        while(numSet.contains(nums[i])){
          len++;
          curr++;
          longest = Math.max(longest, len);

        }

      }
    }

    return longest;
  }

  public static void main(String[] args) {
    int nums[] = {0,3,7,2,5,8,4,6,0,1};
    LongestConsecutiveSequence128 longestConsecutiveSubsequence128 = new LongestConsecutiveSequence128();
    int result = longestConsecutiveSubsequence128.longestConsecutive(nums);
    System.out.println(result);
  }
}