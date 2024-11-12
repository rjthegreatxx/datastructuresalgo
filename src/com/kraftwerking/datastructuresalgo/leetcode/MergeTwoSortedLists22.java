package com.kraftwerking.datastructuresalgo.leetcode;

class MergeTwoSortedLists22 {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummy = new ListNode();
    ListNode tail = dummy;

    while (list1 != null || list2 != null){
      if(list1.val < list2.val){
        tail = list1;
        list1 = list1.next;
      } else {
        tail = list2;
        list2 = list2.next;
      }
    }

    if(list1 != null)  tail = list1.next;
    if(list2 != null)  tail = list2.next;

    return dummy.next;
  }

  public static void main(String[] args) {
    MergeTwoSortedLists22 missingNumber268 = new MergeTwoSortedLists22();

  }
}

