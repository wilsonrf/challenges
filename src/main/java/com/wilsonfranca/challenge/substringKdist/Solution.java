package com.wilsonfranca.challenge.substringKdist;

import java.util.*;

/**
 * Created by wilson on 28/01/18.
 */
public class Solution {

    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public List<String> subStringsKDist(String inputStr, int num)
    {
        // WRITE YOUR CODE HERE
        Set<String> result = new HashSet<>();
        if(num < 0 || num > 26) {
            throw new IllegalArgumentException();
        }
        int length = inputStr.length();
        // from index 0 until the end - substring size
        for(int i = 0; i < length - num; i++) {
            //The begining of substring
            int begin = i;
            //The end of substring
            int end = i + num;
            // The substring
            String substring = inputStr.substring(begin, end);
            if(hasDistinctChars(substring)) {
                result.add(substring);
            }
        }
        return new ArrayList<String>(result);
    }
    // METHOD SIGNATURE ENDS
    protected boolean hasDistinctChars(String input) {

        char arr[] = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j ++) {
                if(arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
