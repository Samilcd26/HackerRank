package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> test=Reverser.StringTolist("5 9 10 7 4");

        int n=6 ;
        int k=3;
        List<Integer> ar =List.of(1, 3, 2, 6, 1, 2);
        System.out.println(divisibleSumPairs(n,k,ar));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int score=0;
        for (int x=0;x<n;x++){
            for (int y=n-1;y>x;y--){
                if ((ar.get(x)+ar.get(y))%k==0) score++;

            }
        }
    return score;
    }

//    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
//        int score=0;
//        for (int x=0;x<n;x++){
//            for (int y=1;y<n;y++){
//                if ((ar.get(x)+ar.get(y))%k==0) System.out.println(ar.get(x)+" + "+ar.get(y));
//                if (y<x)y+=x;
//
//            }
//        }
//        return score-1;
//    }
}

