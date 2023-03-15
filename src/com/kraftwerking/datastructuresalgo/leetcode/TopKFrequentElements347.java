package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.*;
import java.util.stream.Collectors;

class TopKFrequentElements347 {

  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> countsMap = new HashMap<>();

    for(int i = 0;i<nums.length;i++){
      if(countsMap.containsKey(nums[i])){
        countsMap.put(nums[i], countsMap.get(nums[i]) + 1);
      } else {
        countsMap.put(nums[i], 1);

      }
    }

    Map<Integer, Integer> topK =
            countsMap.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(k)
                    .collect(Collectors.toMap(
                            Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));


    int[] res = new int[k];
    Set<Integer> topKSet= topK.keySet();
    int i = 0;
    for (Integer x : topKSet)
      res[i++] = x;
    return res;
  }

  public static void main(String[] args) {
    int[] nums = {-1, 0, 1, 2, -1, -4};
    TopKFrequentElements347 topKFrequentElements347 = new TopKFrequentElements347();
    int[] result = topKFrequentElements347.topKFrequent(nums, 2);
    System.out.println(result);
  }
}