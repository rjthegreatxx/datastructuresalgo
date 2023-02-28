package com.kraftwerking.datastructuresalgo.leetcode;


import static java.lang.Math.max;
import static java.lang.Math.min;

public class ContainerWithMostWater11 {

  public int maxArea(int[] height) {
    int res = 0;
    int l = 0;
    int r = height.length - 1;

    while(l < r){
      int area = (r-l) * min(height[l], height[r]);
      res = max(res, area);
      if(height[l] < height[r]){
        l++;
      } else {
        r--;
      }

    }

    return res;
  }

  public static void main(String[] args) {
    int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

    ContainerWithMostWater11 containerWithMostWater11 = new ContainerWithMostWater11();
    int result = containerWithMostWater11.maxArea(height);
    System.out.println(result);
  }
}