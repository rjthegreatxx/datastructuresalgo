package com.kraftwerking.datastructuresalgo.interview;

import java.util.*;

public class JPMC {
    public int testStrings(List<String > strings){
        Map<String, List<String>> strMap = new HashMap<>();

        for(int i = 0;i< strings.size();i++){
            String str = strings.get(i);
            char array[] = str.toCharArray();
            Arrays.sort(array);
            str = new String(array);

            if(strMap.containsKey(str)){
                List<String> strList = strMap.get(str);
                strList.add(strings.get(i));
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(strings.get(i));
                strMap.put(str, strList);
            }

        }



        return -1;
    }

    public static void main(String[] args){

        List<String > strings = new ArrayList<>();
        strings.add("listen");
        strings.add("silent");
        strings.add("cat");
        strings.add("salient");

        JPMC jpmc = new JPMC();
        int result = jpmc.testStrings(strings);
    }
}
