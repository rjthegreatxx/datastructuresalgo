package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class GraphValidTree261 {

  Set<Integer> visit = new HashSet<>();
  Map<Integer, List<Integer>> adj = new HashMap<>();

  public boolean validTree(int n, int[][] edges) {
    if (n < 1) {
      return true;
    }
    for (int i = 0; i < n; i++) {
      adj.put(i, new ArrayList<>());
    }
    for (int[] edge : edges) {
      adj.get(edge[0]).add(edge[1]);
      adj.get(edge[1]).add(edge[0]);
    }

    return dfs(0, -1) && n == visit.size();
  }

  public boolean dfs(int i, int prev) {
    if (visit.contains(i)) {
      return false;
    }
    visit.add(i);
    for (int j : adj.get(i)) {
      if (j == prev) {
        continue;
      }
      if (!dfs(j, i)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int n = 5;
    int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {1, 4}};

    GraphValidTree261 graphValidTree261 = new GraphValidTree261();
    boolean result = graphValidTree261.validTree(n, edges);
    System.out.println(result);
  }
}