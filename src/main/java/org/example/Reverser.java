package org.example;


import java.util.ArrayList;
import java.util.List;

public class Reverser {
    public static List<Integer> StringTolist(String str){
        List<Integer> convertData=new ArrayList<>();
        List<String> convert= List.of(str.split(" "));
        for(String s : convert) convertData.add(Integer.valueOf(s));
        return convertData;
    }
}
