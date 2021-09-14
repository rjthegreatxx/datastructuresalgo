package com.kraftwerking.datastructuresalgo.datastructurescourse.leetcode;


import java.util.*;

public class ProductOfArrayExceptItself238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftproducts = new int[n];
        int[] rightproducts = new int[n];
        int[] output = new int[n];
        leftproducts[0] = 1;
        rightproducts[n-1] = 1;
        for(int i = 1;i<n;i++){
            leftproducts[i] = nums[i-1] * leftproducts[i-1];
        }
        for(int i = n-2;i>=0;i--){
            rightproducts[i] = nums[i+1] * rightproducts[i+1];
        }
        for(int i = 0;i<n;i++){
            output[i] = leftproducts[i] * rightproducts[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        ProductOfArrayExceptItself238 productOfArrayExceptItself238 = new ProductOfArrayExceptItself238();
        int[] result = productOfArrayExceptItself238.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));

    }
}