package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PacificAtlanticWaterFlow417 {
  int ROWS = 0;
  int COLS = 0;
  Set<List<Integer>> pac = new HashSet<List<Integer>>();
  Set<List<Integer>> atl = new HashSet<List<Integer>>();
  int[][] heights = null;

  public List<List<Integer>> pacificAtlantic(int[][] hts) {
    heights = hts;
    ROWS = hts.length;
    COLS = hts[0].length;

    for(int c = 0;c < COLS; c++){
      dfs(0, c, pac, hts[0][c]);
      dfs(ROWS - 1, c, atl, hts[ROWS - 1][c]);
    }

    for(int r = 0;r < ROWS; r++){
      dfs(r, 0, pac, hts[r][0]);
      dfs(r, COLS, atl, hts[r][COLS - 1]);
    }

    List<List<Integer>> result = new ArrayList<>();
    for(int r = 0;r < ROWS; r++){
      for(int c = 0;c < COLS; c++){
        List<Integer> list = new ArrayList<Integer>();
        list.add(r);
        list.add(c);

        if(pac.contains(list) && atl.contains(list)){
          result.add(list);
        }
      }
    }

    return result;
  }

public void dfs(int r, int c, Set<List<Integer>> visit, int prevHeight) {
  List<Integer> list = new ArrayList<Integer>();
  list.add(r);
  list.add(c);
  if(visit.contains(list) || r < 0 || c < 0 || r == ROWS || c == COLS || heights[r][c] < prevHeight) return;
  visit.add(list);
  dfs(r + 1, c, visit, heights[r][c]);
  dfs(r - 1, c, visit, heights[r][c]);
  dfs(r, c + 1, visit, heights[r][c]);
  dfs(r, c - 1, visit, heights[r][c]);

}

  public static void main(String[] args) {
    int[][] heights = {{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5},
        {5, 1, 1, 2, 4}};
    PacificAtlanticWaterFlow417 pacificAtlanticWaterFlow417 = new PacificAtlanticWaterFlow417();
    List<List<Integer>> result = pacificAtlanticWaterFlow417.pacificAtlantic(heights);
    System.out.println(result);

  }
}