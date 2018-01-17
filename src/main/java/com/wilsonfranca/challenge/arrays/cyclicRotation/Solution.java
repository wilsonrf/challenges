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
        int length = A.length;
        int rotations = 0;
        int mod = K % length;

        if(mod == 0) {
            rotations = length;
        } else {
            rotations = mod;
        }

        int[] solution = new int[length];
        int position = 0;

        for (int i = 0; i < length; i++) {
            if(A[i] < -1000 || A[i] > 1000) {
                throw new IllegalArgumentException();
            }
            position = rotations + i;
            if(position < length) {
                solution[position] = A[i];
            } else {
                solution[position - length] = A[i];
            }

        }

        return solution;
    }

}
