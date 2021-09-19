package com.designpatterns.template.solution;

public abstract class Task {

    private  AuditTrail auditTrail;

    public  Task() {
        auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();
        doExecute();
    }
    //mark as protected, so it cannot be accessible outside of package
    protected abstract void doExecute();
}
