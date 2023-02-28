package com.kraftwerking.datastructuresalgo.leetcode;


public class NumberOfIslands200 {
  public int numIslands(char[][] grid) {
    int count = 0;

    for(int i = 0;i < grid.length; i++){
      for(int j = 0;j < grid[0].length; j++){
        if(grid[i][j] == '1'){
          dfs(grid, i, j);
          count++;
        }
      }
    }

    return count;
  }

  private void dfs(char[][] grid, int i, int j) {
    if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '1') return;
    grid[i][j] = '#';
    dfs(grid, i, j + 1);
    dfs(grid, i, j - 1);
    dfs(grid, i + 1, j);
    dfs(grid, i - 1, j);

  }

  public static void main(String[] args) {
//    char[][] grid = new char[][]{
//        {'1','1','1','1','0'},
//        {'1','1','0','1','0'},
//        {'1','1','0','0','0'},
//        {'0','0','0','0','0'}
//    };

    char[][] grid = new char[][]{
        {'1'},
        {'1'}
    };

    NumberOfIslands200 numberOfIslands200 = new NumberOfIslands200();
    int result = numberOfIslands200.numIslands(grid);
    System.out.println(result);

  }
}