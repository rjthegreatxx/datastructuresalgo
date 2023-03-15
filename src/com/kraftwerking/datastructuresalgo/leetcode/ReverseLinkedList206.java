package com.kraftwerking.datastructuresalgo.leetcode;

class ReverseLinkedList206 {

  public ListNode reverseList(ListNode head) {
    ListNode curr = head;
    ListNode prev = null;
    while (curr != null) {
      ListNode tmp = curr.next;
      curr.next = prev;
      prev = tmp;

    }

    return prev;
  }

  public static void main(String[] args) {
    ReverseLinkedList206 reverseLinkedList206 = new ReverseLinkedList206();
  }
}

