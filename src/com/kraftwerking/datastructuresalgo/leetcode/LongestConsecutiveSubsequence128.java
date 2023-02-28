package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.HashSet;

class LongestConsecutiveSubsequence128 {

  public int longestConsecutive(int[] nums) {
    HashSet<Integer> numSet = new HashSet<>();
    for (Integer n : nums) {
      numSet.add(n);
    }
    int longest = 0;

    for (Integer n : nums) {
      //check if its the start of a sequence
      if (!numSet.contains(n - 1)) {
        int length = 0;
        while (numSet.contains(n + length)) {
          length++;
        }
        longest = Math.max(length, longest);
      }
    }

    return longest;
  }

  public static void main(String[] args) {
    int nums[] = {100, 4, 200, 1, 3, 2};
    LongestConsecutiveSubsequence128 longestConsecutiveSubsequence128 = new LongestConsecutiveSubsequence128();
    int result = longestConsecutiveSubsequence128.longestConsecutive(nums);
    System.out.println(result);
  }
}