package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.ArrayDeque;
import java.util.Deque;

public class NumberOfStudentsUnableToEatLunch1700 {
  public int countStudents(int[] students, int[] sandwiches) {
    Deque<Integer> studentsQueue = new ArrayDeque<>();
    Deque<Integer>  sandwichesQueue = new ArrayDeque<>();

    for(int i = 0; i < students.length; i++) studentsQueue.add(students[i]);
    for(int i = 0; i < sandwiches.length; i++) sandwichesQueue.add(sandwiches[i]);

    int count = 0;
    while (!studentsQueue.isEmpty() && count != studentsQueue.size()) {
      int student = studentsQueue.peek();
      if(student == 1 && sandwichesQueue.peek() != null && sandwichesQueue.peek() == 1){
        studentsQueue.removeFirst();
        sandwichesQueue.removeFirst();
        count++;
      } else if(student == 0 && sandwichesQueue.peek() != null && sandwichesQueue.peek() == 0){
        studentsQueue.removeFirst();
        sandwichesQueue.removeFirst();
        count++;
      } else if(student == 1 && sandwichesQueue.peek() != null && sandwichesQueue.peek() == 0){
        int stu = studentsQueue.removeFirst();
        studentsQueue.add(stu);
        count++;
      }  else if(student == 0 && sandwichesQueue.peek() != null && sandwichesQueue.peek() == 1){
        int stu = studentsQueue.removeFirst();
        studentsQueue.add(stu);
        count++;
      }

    }

    return studentsQueue.size();
  }
}