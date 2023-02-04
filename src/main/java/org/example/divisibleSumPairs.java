package org.example;

import java.util.List;

public class divisibleSumPairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int score=0;
        for (int x=0;x<n;x++){
            for (int y=n-1;y>x;y--){
                if ((ar.get(x)+ar.get(y))%k==0) score++;

            }
        }
        return score;
    }
}
