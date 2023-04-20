package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.ArrayList;
import java.util.List;

class BaseballGame682 {
  public int calPoints(String[] operations) {
    if(operations == null ) return 0;
    List<Integer> scores = new ArrayList<>();

    for(int i = 0;i<operations.length;i++){
      if(operations[i].equals("+")){
        scores.add(scores.get(scores.size()-1) + scores.get(scores.size()-2));
      } else if(operations[i].equals("D")){
        scores.add(scores.get(scores.size()-1) + scores.get(scores.size()-1));
      } else if(operations[i].equals("C")){
        scores.remove(scores.size()-1);
      } else {
        scores.add(Integer.valueOf(operations[i]));
      }
    }

    int total = 0;
    for(int i:scores){
      total += i;
    }
    return total;
  }

  public static void main(String[] args){

    String[] operations = {"5","2","C","D","+"};
    BaseballGame682 baseballGame682 = new BaseballGame682();
    int res = baseballGame682.calPoints(operations);
    System.out.println(res);
  }
}