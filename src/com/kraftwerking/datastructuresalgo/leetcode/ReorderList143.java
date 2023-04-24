package com.kraftwerking.datastructuresalgo.leetcode;

import java.util.ArrayList;
import java.util.List;

class ReorderList143 {

  public void reorderList(ListNode head) {
    ListNode cur = head;
    List<ListNode> nodeList = new ArrayList<>();

    ListNode slow = head;
    ListNode fast = head.next;

    //find mid of list
    while(slow != null && slow.next != null && fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }

    //System.out.println(slow.val);

    //reorder second half of list
    ListNode second = slow.next;
    ListNode prev = null;
    slow.next = null;
    while(second != null){
      ListNode tmp = second.next;
      second.next = prev;
      prev = second;
      second = tmp;
    }

    //merge the two halfs
    ListNode first = head;
    second = prev;
    while(second != null){
      ListNode tmp1 = first.next;
      ListNode tmp2 = second.next;
      first.next = second;
      second.next = tmp1;
      first = tmp1;
      second = tmp2;
    }

  }
}

