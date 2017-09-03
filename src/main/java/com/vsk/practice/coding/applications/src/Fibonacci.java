package com.vsk.practice.coding.applications.src;

import com.vsk.practice.coding.applications.interfaces.CodeRunner;
import com.vsk.practice.coding.framework.utilities.RunTimeAnalysis;

/**
 * Created by VSK on 9/2/17.
 */
public class Fibonacci implements CodeRunner {
    private Long[] fib = new Long[50];
    public Fibonacci() {
        fib[0] = 0L;
        fib[1] = 1L;
    }
    @Override
    public void runProgram() {
        int numberToFindSeries = 40;
        System.out.println("Fibonacci series till number " + numberToFindSeries + "(normal code): ");
        long startTime = System.nanoTime();
        for(int i = 0; i < numberToFindSeries; i++){
            System.out.print(fibonacciNumber_Normal(i) + "  ");
        }
        RunTimeAnalysis.printRunTime(startTime);
        System.out.println("Fibonacci series till number " + numberToFindSeries + "(dp code): ");
        startTime = System.nanoTime();
        for(int i = 0; i < numberToFindSeries; i++){
            System.out.print(fibonacciNumber_DP(i) + "  ");
        }
        RunTimeAnalysis.printRunTime(startTime);
    }
    private long fibonacciNumber_Normal(long n){
        if (n <= 1){
            return n;
        }
        return fibonacciNumber_Normal(n - 1) + fibonacciNumber_Normal(n - 2);
    }
    private long fibonacciNumber_DP(int n){
        if(fib[n] == null ){
            fib[n] = fibonacciNumber_DP(n - 1) + fibonacciNumber_DP(n - 2);
        }
        return fib[n];
    }
}
