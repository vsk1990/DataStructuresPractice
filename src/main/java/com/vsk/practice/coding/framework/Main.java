package com.vsk.practice.coding.framework;

import com.vsk.practice.coding.applications.parameters.SolutionClassNames;
import com.vsk.practice.coding.framework.interfaces.CodeExecutor;
import com.vsk.practice.coding.applications.executor.MySolutionExecutor;

public class Main {
    public static void main(String[] args) throws Exception {
        CodeExecutor executor = new MySolutionExecutor();
        executor.codeExecute(SolutionClassNames.CLASS_FIBONACCI.getName());
    }
}