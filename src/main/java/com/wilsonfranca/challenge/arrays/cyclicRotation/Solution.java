package com.wilsonfranca.challenge.arrays.cyclicRotation;

/**
 * Created by wilson.franca on 16/01/18.
 */
public class Solution {

    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if(K < 0 || K > 100) {
            throw new IllegalArgumentException();
        }
        int[] solution = new int[A.length];
        int position = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] < -1000 || A[i] > 1000) {
                throw new IllegalArgumentException();
            }

        }

        return solution;
    }

}
