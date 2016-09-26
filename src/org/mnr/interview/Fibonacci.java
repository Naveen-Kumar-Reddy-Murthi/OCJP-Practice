package org.mnr.interview;

import java.text.MessageFormat;

public class Fibonacci {
    
    
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Currently not supported.");
        }
        //F(0) = 0
        if (n == 0) {
            return 0;
        }
        //F(1) = 1
        if (n == 1) {
            return 1;
        }
        //F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static long fibonacciUsingIteration(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Currently not supported.");
        }
        //F(0) = 0
        if (n == 0) {
            return 0;
        }
        //F(1) = 1
        if (n == 1) {
            return 1;
        }
        //F(n) = F(n-1) + F(n-2)
        long fn_1 = 1, fn_2 = 0;
        for (int i = 2; i <= n; i++) {
            fn_1 = fn_1 + fn_2;
            fn_2 = fn_1 - fn_2;
        }
        return fn_1;
    }
    
    public static void main(String[] args) {
        int n = 30;
        long startTime = System.nanoTime();
        System.out.println(MessageFormat.format("result = {0}; calculated in {1}ns", fibonacci(n), System.nanoTime()-startTime));
        startTime = System.nanoTime();
        System.out.println(MessageFormat.format("result = {0}; calculated in {1}ns", fibonacciUsingIteration(n), System.nanoTime()-startTime));
    }

}
