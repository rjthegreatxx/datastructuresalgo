package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.ArrayList;
import java.util.List;

class WordBreak139 {

  public boolean wordBreak(String s, List<String> wordDict) {
    int n = s.length();
    boolean[] dp = new boolean[n + 1];
    int maxLen = 0;
    for (String word : wordDict) {
      maxLen = Math.max(maxLen, word.length());
    }
    dp[0] = true;

    for (int i = 0; i <= n; i++) {
      for (int j = i - 1; j >= 0; j--) {
        if (i - j > maxLen) {
          continue;
        }
        if (dp[j] && wordDict.contains(s.substring(j, i))) {
          dp[i] = true;
          break;

        }
      }
    }

    return dp[n];
  }

  public static void main(String[] args) {
    WordBreak139 wordBreak139 = new WordBreak139();
    List<String> wordDict = new ArrayList<>();
    wordDict.add("leet");
    wordDict.add("code");
    boolean result = wordBreak139.wordBreak("leetcode", wordDict);
    System.out.println(result);
  }
}