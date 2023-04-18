package com.kraftwerking.datastructuresalgo.leetcode;

public class SearchA2DMatrix74 {
  public boolean searchMatrix(int[][] matrix, int target) {
    int cols = matrix[0].length;
    int top = 0;
    int bottom = matrix.length - 1;
    int row = -1;
    int l = 0;
    int r = matrix[0].length - 1;

    while(top<=bottom){
      if(target > matrix[top][cols - 1]){
        top++;
      } else if(target < matrix[bottom][0]){
        bottom--;
      } else if(top == bottom){
        row = top;
        break;
      }
    }

    if(row == -1)return false;

    while(l<=r){
      int mid = (l + r)/2;

      if(target > matrix[row][mid]){
        l = mid + 1;
      } else if(target < matrix[row][mid]){
        r = mid - 1;
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