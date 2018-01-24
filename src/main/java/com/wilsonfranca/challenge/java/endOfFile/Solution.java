package com.wilsonfranca.challenge.java.endOfFile;

import java.util.Scanner;

/**
 * Created by wilson on 23/01/18.
 */
public class Solution {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        solution.read(scanner);
    }

    public void read(Scanner scanner) {

        int lineNumber = 0;
        while (scanner.hasNext()) {
            System.out.println(++lineNumber+" "+scanner.nextLine());
        }
    }
}
