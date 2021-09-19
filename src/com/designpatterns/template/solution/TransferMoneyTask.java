package com.designpatterns.template.solution;

import com.designpatterns.template.problem.AuditTrail;

public class TransferMoneyTask extends Task {
    //mark as protected, so it cannot be accessible outside of package
    @Override
    protected void doExecute() {
        System.out.println("Transfer money");
    }
}
