package com.design.patterns.core.visitor;

/**
 * Created by lihongming on 16/6/21.
 */
public class CommonEmployee extends Employee {

    /**
     * 工作
     */
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }




    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
