package com.kraftwerking.datastructuresalgo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum15 {

  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);

    for(int i = 0;i<nums.length;i++){
      if(i == 0 || i>0 && nums[i] != nums[i-1]){
        int l = i + 1;
        int r = nums.length - 1;
        int sum = 0 - nums[i];

        while(l<r){
          if(nums[l] + nums[r] == sum){
            List<Integer> newList = new ArrayList<>();
            newList.add(nums[i]);
            newList.add(nums[l]);
            newList.add(nums[r]);
            result.add(newList);

            while(l < r && nums[l] == nums[l+1]){
              l++;
            }
            l++;
            r--;
          } else if (nums[l] + nums[r] < sum){
            l++;
          } else if (nums[l] + nums[r] > sum){
            r--;
          }
        }
      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[] nums = {-1, 0, 1, 2, -1, -4};
    ThreeSum15 threeSum15 = new ThreeSum15();
    List<List<Integer>> result = threeSum15.threeSum(nums);
    System.out.println(result);
  }
}