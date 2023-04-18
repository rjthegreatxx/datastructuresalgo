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
      if(!numSet.contains(nums[i] - 1)){ //start of new sequence, dont want to check this for every iteration
        int len = 0;
        int cur = nums[i];

        while(numSet.contains(cur)){
          len++;
          cur++;
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