package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.HashMap;
import java.util.Map;

public class ValidAnagram242 {
  public boolean isAnagram(String s, String t) {
    Map<Character, Integer> characterMap = new HashMap<>();
    char[] arr1 = s.toCharArray();
    char[] arr2 = t.toCharArray();

    for(char c:arr1){
      characterMap.put(c, characterMap.getOrDefault(c, 0) + 1);
    }

    for(char c:arr2){
      if(characterMap.containsKey(c) && characterMap.get(c) != 0){
        characterMap.put(c, characterMap.getOrDefault(c, 0) - 1);
      } else if(!characterMap.containsKey(c)){
        return false;
      }
    }

    int total = 0;
    for(int v: characterMap.values()){
      total = total + v;
    }

    if(total > 0){
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    ValidAnagram242 validAnagram242 = new ValidAnagram242();
    boolean result = validAnagram242.isAnagram("anagram", "nagaram");
    System.out.println(result);

  }
}