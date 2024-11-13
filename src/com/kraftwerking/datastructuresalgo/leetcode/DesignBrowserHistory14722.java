package com.kraftwerking.datastructuresalgo.leetcode;

class DesignBrowserHistory1472 {
  class ListNode {
    ListNode prev;
    ListNode next;
    String url;

    ListNode() {}
    ListNode(String url) { this.url = url; }
    ListNode(String url, ListNode prev, ListNode next) {
      this.url = url;
      this.prev = prev;
      this.next = next;
    }
  }

  class BrowserHistory {

    ListNode left;
    ListNode right;
    ListNode cur;

    public BrowserHistory(String homepage) {
      left = new ListNode(null);
      right = new ListNode(null);
      ListNode node = new ListNode(homepage);
      left.next = node;
      right.prev = node;
      node.prev = left;
      node.next = right;
      cur = node;
        
    }
    
    public void visit(String url) {
      ListNode node = new ListNode(url);
      cur.next = node;
      node.prev = left;
      node.next = right;
      right.prev = node;
      cur = cur.next;
        
    }
    
    public String back(int steps) {
      while(cur != null && steps > 0){
        if(cur.prev == left) break;
        cur = cur.prev;
        steps--;
      }
      return cur.url;
    }
    
    public String forward(int steps) {
      while(cur != null && steps > 0){
        if(cur.next == right) break;
        cur = cur.next;
        steps--;
      }
      return cur.url;
    }
  }

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
}

