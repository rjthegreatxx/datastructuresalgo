package com.kraftwerking.datastructuresalgo.interview;

import java.util.*;

public class AmFreight {

    public static void main(String[] args){
      //
        int[] arr = {2,0,1,3,4,5,6,7,10,8,9};
        int sum = 7;
        Set<Integer> numSet = new HashSet<>();
        Set<List<Integer>> uniqueSet = new HashSet<>();
        for(int i: arr){
            numSet.add(i);
        }

        for(int i = 0;i< arr.length;i++){
            if(arr[i] <= sum){
                int target = sum - arr[i];
                if(numSet.contains(target)){
                    //System.out.println(arr[i] + " " + target);
                    List<Integer> cur = new ArrayList<>();
                    cur.add(arr[i]);
                    cur.add(target);
                    Collections.sort(cur);
                    uniqueSet.add(cur);
                }
            }
        }
        int i = 0;
    }
}