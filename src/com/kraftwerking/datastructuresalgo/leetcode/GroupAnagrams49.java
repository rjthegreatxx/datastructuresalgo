package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.*;

class GroupAnagrams49 {

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> mapOfStrLists = new HashMap<>();

    for(int i = 0;i<strs.length;i++){
      String str = strs[i];
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      String sortedStr = String.valueOf(chars);

      if(mapOfStrLists.containsKey(sortedStr)){
        List<String > newList = mapOfStrLists.get(sortedStr);
        newList.add(str);
        mapOfStrLists.put(sortedStr, newList);
      } else {
        List<String> newList = new ArrayList<>();
        newList.add(str);
        mapOfStrLists.put(sortedStr, newList);
      }
    }

    List<List<String>> res = new ArrayList<>(mapOfStrLists.values());
    return res;
  }

  public static void main(String[] args) {
    String[] strs = {"eat","tea","tan","ate","nat","bat"};
    GroupAnagrams49 groupAnagrams49 = new GroupAnagrams49();
    List<List<String>> result = groupAnagrams49.groupAnagrams(strs);
    System.out.println(result);
  }
}