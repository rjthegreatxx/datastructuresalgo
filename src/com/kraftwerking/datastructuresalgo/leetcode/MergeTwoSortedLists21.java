package com.kraftwerking.datastructuresalgo.leetcode;

class MergeTwoSortedLists21 {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummy = new ListNode();
    ListNode tail = dummy;

    while(list1 != null && list2 != null){
      if(list1.val < list2.val){
        tail.next = list1;
        list1 = list1.next;
      } else {
        tail.next = list2;
        list2 = list2.next;
      }
      tail = tail.next;
    }

    if(list1 != null) tail.next = list1;
    if(list2 != null) tail.next = list2;

    return dummy.next;
  }

  public static void main(String[] args) {
    MergeTwoSortedLists21 missingNumber268 = new MergeTwoSortedLists21();

  }
}
