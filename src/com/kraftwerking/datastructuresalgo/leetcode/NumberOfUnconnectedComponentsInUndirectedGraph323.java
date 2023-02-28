package com.kraftwerking.datastructuresalgo.leetcode;


public class NumberOfUnconnectedComponentsInUndirectedGraph323 {
  int[] par;
  int[] rank;

  public int countComponents(int n, int[][] edges) {
    par = new int[n];
    rank = new int[n];

    for (int i = 0; i < par.length; i++) {
      par[i] = i;
      rank[i] = 1;
    }

    int res = n;
    for(int i = 0;i < edges.length; i++){
      res -= union(edges[i][0], edges[i][1]);
    }
    return res;
  }

  public int find(int n1){
    int res = n1;
    while(res != par[res]){
      par[res] = par[par[res]];
      res = par[res];
    }
    return res;
  }

  public int union(int n1, int n2){
    int p1 = find(n1);
    int p2 = find(n2);
    if(p1 == p2) return 0;
    if(rank[p2]> rank[p1]){
      par[p1] = p2;
      rank[p2] += rank[p1];
    } else {
      par[p2] = p1;
      rank[p1] += rank[p2];
    }
    return 1;
  }

  public static void main(String[] args) {
    int n = 5;
//    edges = [[0, 1], [1, 2], [3, 4]]
    int[][] edges = new int[][]{
        {0, 1},
        {1, 2},
        {3, 4}
    };

    NumberOfUnconnectedComponentsInUndirectedGraph323 numberOfUnconnectedComponentsInUndirectedGraph323 = new NumberOfUnconnectedComponentsInUndirectedGraph323();
    int result = numberOfUnconnectedComponentsInUndirectedGraph323.countComponents(n, edges);
    System.out.println(result);

  }
}