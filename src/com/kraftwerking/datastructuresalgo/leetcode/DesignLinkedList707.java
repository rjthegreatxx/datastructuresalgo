package com.kraftwerking.datastructuresalgo.leetcode;

class DesignLinkedList707 {
  static class ListNode {
    ListNode prev;
    ListNode next;
    int val;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode prev, ListNode next) {
      this.val = val;
      this.prev = prev;
      this.next = next;
    }
  }

  class MyLinkedList {
    ListNode left;
    ListNode right;

    public MyLinkedList() {
      left = new ListNode(0);
      right = new ListNode(0);
      left.next = right;
      right.prev = left;

    }

    public int get(int index) {
      ListNode cur = left.next;
      while(cur != null && index > 0){
        cur = cur.next;
        index--;
      }
      if(cur != null && cur != right && index == 0){
        return cur.val;
      }
      return -1;
    }

    public void addAtHead(int val) {
      ListNode node = new ListNode(val);
      ListNode prev = left;
      ListNode next = left.next;
      prev.next = node;
      next.prev = node;
      node.next = next;
      node.prev = prev;

    }

    public void addAtTail(int val) {
      ListNode node = new ListNode(val);
      ListNode prev = right.prev;
      ListNode next = right;
      prev.next = node;
      next.prev = node;
      node.next = next;
      node.prev = prev;
    }

    public void addAtIndex(int index, int val) {
      ListNode cur = left.next;
      while(cur != null && index > 0){
        cur = cur.next;
        index--;
      }
      if(cur != null && index == 0){
        ListNode node = new ListNode(val);
        ListNode next = cur;
        ListNode prev = cur.prev;
        prev.next = node;
        next.prev = node;
        node.next = next;
        node.prev = prev;
      }
    }

    public void deleteAtIndex(int index) {
      ListNode cur = left.next;
      while(cur != null && index > 0){
        cur = cur.next;
        index--;
      }
      if(cur != null && cur != right && index == 0){
        ListNode next = cur.next;
        ListNode prev = cur.prev;
        next.prev = prev;
        prev.next = next;
      }
    }

  }

  /**
   * Your MyLinkedList object will be instantiated and called as such:
   * MyLinkedList obj = new MyLinkedList();
   * int param_1 = obj.get(index);
   * obj.addAtHead(val);
   * obj.addAtTail(val);
   * obj.addAtIndex(index,val);
   * obj.deleteAtIndex(index);
   */

  public static void main(String[] args) {
    DesignLinkedList707 missingNumber268 = new DesignLinkedList707();

  }
}

