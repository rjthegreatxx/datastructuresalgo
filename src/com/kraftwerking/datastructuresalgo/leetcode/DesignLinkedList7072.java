package com.kraftwerking.datastructuresalgo.leetcode;

class DesignLinkedList707 {
  static class ListNode {
    ListNode next;
    int val;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  class MyLinkedList {
    ListNode right;

    public MyLinkedList() {
      right = new ListNode(0);
    }

    public int get(int index) {
      ListNode cur = right.next;
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
      node.next = right;
    }

    public void addAtTail(int val) {
      ListNode node = new ListNode(val);
      ListNode cur = right.next;

      while(cur.next != null){
        cur = cur.next;
      }
      cur.next = node;
    }

    public void addAtIndex(int index, int val) {
      ListNode cur = right.next;
      while(cur != null && index > 0){
        cur = cur.next;
        index--;
      }
      if(cur != null && index == 0){
        ListNode node = new ListNode(val);
        ListNode tmp = cur.next;
        cur.next = node;
        node.next = tmp;
      }
    }

    public void deleteAtIndex(int index) {
      ListNode cur = right;
      while(cur != null && index > 0){
        cur = cur.next;
        index--;
      }
      if(cur != null && index == 1){
        ListNode tmp = cur.next;
        cur.next = tmp;
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

