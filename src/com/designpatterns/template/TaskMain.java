package com.designpatterns.template;

import com.designpatterns.template.solution.Task;
import com.designpatterns.template.solution.TransferMoneyTask;

public class TaskMain {

    public static void main(String[] args) {
        Task task = new TransferMoneyTask();
        task.execute();
    }
}
