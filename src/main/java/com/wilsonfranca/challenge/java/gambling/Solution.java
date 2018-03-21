package com.wilsonfranca.challenge.java.gambling;

import java.util.Stack;

/**
 * Created by wilson on 18/03/18.
 */

class Solution {

    public int solution(int N, int K) {
        // write your code in Java SE 8
        int rounds = 0;
        Stack<Integer> integers = new Stack<>();

        if(K == 0) {
            rounds = N - 1;
            return rounds;
        }

        int aux = N;
        while (aux > 2 && K > 0) {
            aux = aux / 2;
            integers.add(aux);
            K--;
        }

        int chips = 1;
        while (!integers.isEmpty()) {
            int current = integers.peek();
            if(current == chips) {
                chips *= 2;
                integers.pop();
            } else {
                chips++;
            }
            rounds++;
        }


        return rounds;
    }
}