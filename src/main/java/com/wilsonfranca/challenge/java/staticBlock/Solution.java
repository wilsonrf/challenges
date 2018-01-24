package com.wilsonfranca.challenge.java.staticBlock;

import java.util.Scanner;

/**
 * Created by wilson.franca on 24/01/18.
 */
public class Solution {

    static Scanner scanner = new Scanner(System.in);
    static int B = initializeB();
    static int H = initializeH();
    static boolean flag = initializeFlag();

    public static int initializeB() {
        return scanner.nextInt();
    }

    public static int initializeH() {
        return scanner.nextInt();
    }

    public static boolean initializeFlag() {
        try {
            if (B > 0 && H > 0) {
                return true;
            } else {
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main
}
