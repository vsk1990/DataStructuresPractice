package com.vsk.practice.coding.framework.utilities;

/**
 * Created by VSK on 9/2/17.
 */
public class RunTimeAnalysis {

    public static void printRunTime(long startTime){
        System.out.println();
        System.out.println("Time taken :" + runtimeInMillis(startTime));
    }

    public static long runtimeInMillis(long startTime){
        return System.nanoTime() - startTime;
    }
}
