package com.kraftwerking.datastructuresalgo.leetcode;

public class SearchA2DMatrix74 {
  public boolean searchMatrix(int[][] matrix, int target) {
    int ROWS = matrix.length;
    int COLS = matrix[0].length;

    int top = 0, bot = ROWS - 1;
    while (top <= bot) {
      int row = (top + bot) / 2;
      if (target > matrix[row][COLS - 1]) {
        top = row + 1;
      } else if (target < matrix[row][0]) {
        bot = row - 1;
      } else {
        break;
      }
    }

    if (!(top <= bot)) {
      return false;
    }
    int row = (top + bot) / 2;
    int l = 0, r = COLS - 1;
    while (l <= r) {
      int m = (l + r) / 2;
      if (target > matrix[row][m]) {
        l = m + 1;
      } else if (target < matrix[row][m]) {
        r = m - 1;
      } else {
        return true;
      }
      }
    return false;
  }

  public static void main(String[] args){
    int[][] matrix  = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    SearchA2DMatrix74 searchA2DMatrix74 = new SearchA2DMatrix74();
    boolean result = searchA2DMatrix74.searchMatrix(matrix, 3);
    System.out.println(result);

  }

}