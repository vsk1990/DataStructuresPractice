package com.vsk.practice.coding.applications.parameters;

/**
 * Created by VSK on 9/2/17.
 */
public enum SolutionClassNames {
    CLASS_FIBONACCI("com.vsk.practice.coding.applications.src.Fibonacci");

    private String name;

    SolutionClassNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
