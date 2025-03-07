package com.kraftwerking.datastructuresalgo.leetcode;

import java.util.*;

class GroupAnagrams492 {

  public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> res = new ArrayList<>();
    Map<String, List<String>> anMap = new HashMap<>();

    for (String s : strs) {
      char[] arr = s.toCharArray();
      Arrays.sort(arr);
      String sortedStr = new String(arr);

      if (anMap.containsKey(sortedStr)) {
        anMap.get(sortedStr).add(s);
      } else {
        List<String> newList = new ArrayList<>();
        newList.add(s);
        anMap.put(sortedStr, newList);
      }

      for (Map.Entry<String, List<String>> entry : anMap.entrySet()) {
        res.add(entry.getValue());
      }

    }

    return res;
  }

  public static void main(String[] args) {
    String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
    GroupAnagrams492 groupAnagrams492 = new GroupAnagrams492();
    List<List<String>> result = groupAnagrams492.groupAnagrams(strs);
    System.out.println(result);
  }
}