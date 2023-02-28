package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.HashMap;

public class DecodeWays91 {

  HashMap<Integer, Integer> dp = new HashMap<>();

  public int numDecodings(String s) {
    dp.put(s.length(), 1);
    return dfs(0, s);
  }

  public int dfs(int i, String s) {
    if (dp.containsKey(i)) {
      return dp.get(i);
    }
    if (String.valueOf(s.charAt(i)).equals("0")) {
      return 0;
    }

    int res = dfs(i + 1, s);
    if (((i + 1) < s.length()) && ((String.valueOf(s.charAt(i)).equals("1") || ((
        String.valueOf(s.charAt(i)).equals("2") && ("0123456"
            .contains(String.valueOf(s.charAt(i + 1))))))))) {
      res += dfs(i + 2, s);
      dp.put(i, res);
    }

    return res;
  }

  public static void main(String[] args) {
    String s = "226";
    DecodeWays91 decodeWays91 = new DecodeWays91();
    int result = decodeWays91.numDecodings(s);
    System.out.println(result);

  }
}