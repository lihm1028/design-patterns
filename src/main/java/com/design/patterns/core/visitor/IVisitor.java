package com.design.patterns.core.visitor;

/**
 * Created by lihongming on 16/6/21.
 */
public interface IVisitor {


    public void visit(CommonEmployee commonEmployee);

    public void visit(Manager manager);
}
