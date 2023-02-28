package com.kraftwerking.datastructuresalgo.leetcode;


public class UniquePaths62 {

  public int uniquePaths(int m, int n) {
    int[] row = new int[n];
    for (int i = 0; i < n; i++) {
      row[i] = 1;
    }

    for (int ii = 0; ii < (m - 1); ii++) {
      int[] newRow = new int[n];
      for (int i = 0; i < n; i++) {
        newRow[i] = 1;
      }

      for (int j = (n - 2); j >= 0; j--) {
        newRow[j] = newRow[j + 1] + row[j];
      }
      row = newRow;
    }
    return row[0];
  }

  public static void main(String[] args) {
    UniquePaths62 uniquePaths62 = new UniquePaths62();
    int result = uniquePaths62.uniquePaths(3, 7);
    System.out.println(result);

  }
}