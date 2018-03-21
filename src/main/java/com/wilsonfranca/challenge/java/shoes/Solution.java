package com.wilsonfranca.challenge.java.shoes;

/**
 * Created by wilson on 20/03/18.
 */
public class Solution {

    public int solution(String s) {

        int turns = 0;
        int totalRs = 0;
        int totalLs = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R') {
                totalRs++;
            } else {
                totalLs++;
            }
            if(totalRs == totalLs) {
                turns++;
                totalRs = 0;
                totalLs = 0;
            }
        }

        return turns;
    }
}
