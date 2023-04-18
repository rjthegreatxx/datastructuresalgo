package com.kraftwerking.datastructuresalgo.leetcode;
/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class GuessNumberHigherOrLower374 {
  public int guessNumber(int n) {
    int mid;
    int low = 1;
    int high = n;

    while(low<=high){
      mid = low + (high-low)/2;
      if(guess(mid) == -1){
        high = mid - 1;
      } else if(guess(mid) == 1){
        low = mid + 1;
      } else if(guess(mid) == 0){
        return mid;
      }

    }
    return -1;
  }

  private int guess(int mid) {
    return -1;
  }

  public static void main(String[] args){
    GuessNumberHigherOrLower374 guessNumberHigherOrLower374 = new GuessNumberHigherOrLower374();
//    guessNumberHigherOrLower374.guessNumber(10);
  }

}