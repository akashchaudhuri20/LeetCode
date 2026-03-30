package com.leetcode;

/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbStairs(n));
    }

    private static int climbStairs(int n) {
        if (n == 1 || n == 2)
            return n;
        int previousTwo = 1;
        int previousOne = 2;
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = previousTwo + previousOne;
            previousTwo = previousOne;
            previousOne = current;
        }
        return current;
    }
}