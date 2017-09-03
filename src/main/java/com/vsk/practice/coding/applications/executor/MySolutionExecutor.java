package com.vsk.practice.coding.applications.executor;

import com.vsk.practice.coding.framework.interfaces.CodeExecutor;
import com.vsk.practice.coding.applications.interfaces.CodeRunner;

/**
 * Created by VSK on 9/2/17.
 */
public class MySolutionExecutor implements CodeExecutor {

    public void codeExecute(String className) throws  Exception{
        Class<?> objectClass = null;
        try {
            objectClass = Class.forName(className);
            Object object = objectClass.newInstance();
            if(!(object instanceof CodeRunner)){
                System.out.println("The Class does not implement the CodeRunner interface. It is Not Executable");
            }
            ((CodeRunner)object).runProgram();
        } catch (Exception e) {
            throw e;
        }
    }
}

