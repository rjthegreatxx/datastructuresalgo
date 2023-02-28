package com.kraftwerking.datastructuresalgo.leetcode;

class HouseRobber198 {

  public int rob(int[] nums) {
    int rob1 = 0;
    int rob2 = 0;

    for (int n : nums) {
      int temp = Math.max(n + rob1, rob2);
      rob1 = rob2;
      rob2 = temp;
    }

    return rob2;
  }

  public static void main(String[] args) {
    HouseRobber198 houseRobber198 = new HouseRobber198();
    int[] nums = {1, 2, 3, 1};
    int result = houseRobber198.rob(nums);
    System.out.println(result);
  }
}