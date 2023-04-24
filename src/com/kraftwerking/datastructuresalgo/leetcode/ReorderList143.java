package com.kraftwerking.datastructuresalgo.leetcode;

class ReorderList143 {

  public void reorderList(ListNode head) {
    ListNode cur = head;
    ListNode l = head;
    ListNode r;
    int c = 1;

    while(cur.next != null){
      cur = cur.next;
      c++;
    }

    System.out.println(cur.val);
    System.out.println(c);
    r = cur;


  }

  public static void main(String[] args){
    //
    int[] nums = {1,2,3,4,5,6,7};

    int l = 0;
    int r = nums.length-1;
    while(l<=r){
      System.out.println(nums[l]);
      System.out.println(nums[r]);
      l++;
      r--;
  }
}
}

