package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class AlienDictionary269 {

  public String alienOrder(String[] words) {
    Map<Character, Set<Character>> map = new HashMap<Character, Set<Character>>();
    Map<Character, Integer> degree = new HashMap<Character, Integer>();
    String result = "";
    if (words == null || words.length == 0) {
      return result;
    }
    for (String s : words) {
      for (char c : s.toCharArray()) {
        degree.put(c, 0);
      }
    }

    for (int i = 0; i < words.length - 1; i++) {
      String currentWord = words[i];
      String nextWord = words[i + 1];
      // In a valid alphabet, prefixes are always first
      if (currentWord.length() > nextWord.length() && currentWord.startsWith(nextWord)) {
        return "";
      }
      int minLen = Math.min(currentWord.length(), nextWord.length());
      for (int j = 0; j < minLen; j++) {
        char c1 = currentWord.charAt(j);
        char c2 = nextWord.charAt(j);
        if (c1 != c2) {
          Set<Character> set = new HashSet<Character>();
          if (map.containsKey(c1)) {
            set = map.get(c1);
          }
          if (!set.contains(c2)) {
            set.add(c2);
            map.put(c1, set);
            degree.put(c2, degree.get(c2) + 1);
          }
          break;
        }

      }

    }

    Queue<Character> q = new LinkedList<Character>();
    for (char c : degree.keySet()) {
      if (degree.get(c) == 0) {
        q.add(c);
      }
    }
    while (!q.isEmpty()) {
      char c = q.remove();
      result += c;
      if (map.containsKey(c)) {
        for (char c2 : map.get(c)) {
          degree.put(c2, degree.get(c2) - 1);
          if (degree.get(c2) == 0) {
            q.add(c2);
          }
        }
      }
    }
    if (result.length() != degree.size()) {
      return "";
    }
    return result;
  }

  public static void main(String[] args) {
    String[] words = new String[]{"wrt", "wrf", "er", "ett", "rftt"};
    AlienDictionary269 alienDictionary269 = new AlienDictionary269();
    String result = alienDictionary269.alienOrder(words);
    System.out.println(result);
  }
}