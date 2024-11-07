package com.kraftwerking.datastructuresalgo.leetcode;

class ReverseLinkedList2062 {

  public ListNode reverseList(ListNode head) {
    ListNode curr = head;
    ListNode prev = null;

    while(curr != null){
      ListNode tmp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = tmp;
    }
    return prev;
  }

  
  public static void main(String[] args) {
    ReverseLinkedList2062 reverseLinkedList206 = new ReverseLinkedList2062();
  }
}

