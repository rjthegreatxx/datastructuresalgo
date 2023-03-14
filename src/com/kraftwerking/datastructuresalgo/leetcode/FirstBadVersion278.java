package com.kraftwerking.datastructuresalgo.leetcode;


public class FirstBadVersion278 {
  public int firstBadVersion(int n) {
    int mid;
    int low = 1;
    int high = n;

    while (low < high) {
      mid = low + (high - low) / 2;

      if (isBadVersion(mid) == false) {
        low = mid + 1;
      } else if (isBadVersion(mid) == true) {
        high = mid;
      }
    }
    return low;
  }

  private boolean isBadVersion(int n) {
    if(n == 4) return true;
    return false;
  }

  public static void main(String[] args) {
    String s = "226";
    FirstBadVersion278 firstBadVersion278 = new FirstBadVersion278();
    int result = firstBadVersion278.firstBadVersion(5);
    System.out.println(result);

  }
}