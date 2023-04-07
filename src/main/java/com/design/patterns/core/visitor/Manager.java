package com.design.patterns.core.visitor;

/**
 * 管理者
 * Created by lihongming on 16/6/21.
 */
public class Manager extends Employee {

    /**
     * 业绩
     */
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }



    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
