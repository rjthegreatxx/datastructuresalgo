package com.kraftwerking.datastructuresalgo.leetcode;

public class SearchA2DMatrix74 {
  public boolean searchMatrix(int[][] matrix, int target) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int top = 0;
    int bottom = matrix.length - 1;
    int row = -1;

    while(top <= bottom){
      if(top == bottom) {
        row = top;
        break;
      } else if(target > matrix[top][cols-1]){
        top++;
      } else if(target < matrix[bottom][0]){
        bottom--;
      }
    }

    if(row == -1) {
      return false;
    }

    int L = 0, R = matrix[row].length - 1;
    int mid;

    while (L <= R) {
      mid = (L + R) / 2;
      if (target > matrix[row][mid]) {
        L = mid + 1;
      } else if (target < matrix[row][mid]) {
        R = mid - 1;
      } else {
        return true;
      }
    }

    return false;
  }

  public boolean searchMatrixAttempt1(int[][] matrix, int target) {
    int a = matrix[0].length;
    int b = matrix.length;
    int newSz = a * b;
    int rowCount = 0;

    int[] flat = new int[newSz];
    for(int i = 0;i<matrix.length;i++){
      int[] row = matrix[i];
      for(int j = 0;j<row.length;j++){
        flat[rowCount] = row[j];
        rowCount++;
      }
    }

    int L = 0, R = flat.length - 1;
    int mid;

    while (L <= R) {
      mid = (L + R) / 2;
      if (target > flat[mid]) {
        L = mid + 1;
      } else if (target < flat[mid]) {
        R = mid - 1;
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
    int i = 0;
  }

}