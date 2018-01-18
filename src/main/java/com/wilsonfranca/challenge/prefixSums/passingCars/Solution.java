package com.wilsonfranca.challenge.prefixSums.passingCars;

/**
 * Created by wilson.franca on 18/01/18.
 */
public class Solution {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum = 0;
        int length = A.length;

        if(length < 1) {
            throw new IllegalArgumentException();
        }

        if(length > 100000) {
            return -1;
        }

        int west = 0;

        for(int i = 0; i < A.length; i++) {
            if(A[i] != 0 && A[i] != 1) {
                throw new IllegalArgumentException();
            }

            if (west > 0) {
                if (A[i] == 1) {
                    sum += (1 * west);
                }
            }

            if(A[i] == 0) {
                west++;
            }

        }

        return sum;
    }
}
