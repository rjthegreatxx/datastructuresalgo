package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.*;

class GroupAnagrams49 {

  public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> res = new ArrayList<>();
    Map<String, List<String>> anMap = new HashMap<>();

    for(String s: strs){
      char[] arr = s.toCharArray();
      Arrays.sort(arr);
      String sortedStr = new String(arr);

      if(anMap.containsKey(sortedStr)){
        List<String> newList = anMap.get(sortedStr);
        newList.add(s);
        anMap.put(sortedStr,newList);

      } else {
        List<String> newList = new ArrayList<>();
        newList.add(s);
        anMap.put(sortedStr, newList);
      }
    }

    for(Map.Entry<String, List<String >> entry: anMap.entrySet()) {
      res.add(entry.getValue());
    }

    return res;
  }

  public static void main(String[] args) {
    String[] strs = {"eat","tea","tan","ate","nat","bat"};
    GroupAnagrams49 groupAnagrams49 = new GroupAnagrams49();
    List<List<String>> result = groupAnagrams49.groupAnagrams(strs);
    System.out.println(result);
  }
}