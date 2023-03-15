package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.*;

public class CourseSchedule207 {

  Map<Integer, ArrayList<Integer>> preMap = new HashMap<>();
  //visitSet = all courses along current dfs path
  Set<Integer> visitSet = new HashSet<>();

  public boolean canFinish(int numCourses, int[][] prerequisites) {
    //map ea course to prereq list
    for (int i = 0; i < prerequisites.length; i++) {
      ArrayList<Integer> tmpList = preMap.get(prerequisites[i][0]);
      if (tmpList == null) {
        tmpList = new ArrayList<>();
      }
      tmpList.add(prerequisites[i][1]);
      preMap.put(prerequisites[i][0], tmpList);
    }

    for(Integer crs = 0;crs < numCourses;crs++){
      boolean res = dfs(crs);
      if(!res) return false;
    }

    return true;
  }

  public boolean dfs(Integer crs) {
    if(visitSet.contains(crs)) return false;
    if(preMap.get(crs) == null) return true;
    if(preMap.get(crs).size() == 0) return true;

    visitSet.add(crs);
    for(Integer pre:preMap.get(crs)){
      if(!dfs(pre)) return false;
    }
    visitSet.remove(crs);
    preMap.put(crs,new ArrayList<>());

    return true;
  }

  public static void main(String[] args) {
    int numCourses = 5;
    int[][] prerequisites = {{1,4},{2,4},{3,1},{3,2}};
//    int numCourses = 2;
//    int[][] prerequisites = {{1,0},{0,1}};

    CourseSchedule207 courseSchedule207 = new CourseSchedule207();
    boolean result = courseSchedule207.canFinish(numCourses, prerequisites);
    System.out.println(result);

  }
}