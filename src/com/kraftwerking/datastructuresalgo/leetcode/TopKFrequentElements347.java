package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class TopKFrequentElements347 {

  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer,Integer> countsMap = new HashMap<>();

    for(int i = 0;i<nums.length;i++){
      if(countsMap.containsKey(nums[i])){
        countsMap.put(nums[i], countsMap.get(nums[i])+1);
      } else {
        countsMap.put(nums[i], 1);
      }
    }
    List<Integer> resList = countsMap.entrySet().stream()
            .sorted(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

    List<Integer> resList2 = resList.subList(resList.size()-k, resList.size());
    return resList2.stream().mapToInt(i -> i).toArray();
  }

  public static void main(String[] args) {
    int[] nums = {1,1,1,2,2,3};
    TopKFrequentElements347 topKFrequentElements347 = new TopKFrequentElements347();
    int[] result = topKFrequentElements347.topKFrequent(nums, 2);
    System.out.println(result);
  }
}