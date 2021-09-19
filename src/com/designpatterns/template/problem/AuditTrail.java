package com.designpatterns.template.problem;

/*
* Problem:
* An application want to have an audit trail when a task has executed,
* hence each task class has injected AuditTrail class and all task class has similar template
* when more task is added to the application, these tasks will be following the same template,
* therefore, repetitive code are written each time a task is added.
* */

public class AuditTrail {

    public void record(){
        System.out.println("recording task activities......");
    }
}
