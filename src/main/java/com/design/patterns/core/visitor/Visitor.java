package com.design.patterns.core.visitor;

/**
 * Created by lihongming on 16/6/21.
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(getCommonEmployeeInfo(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(getManagerInfo(manager));
    }

    public String getCommonEmployeeInfo(CommonEmployee commonEmployee) {
        String info = "姓名:" + commonEmployee.getName() + "\t" + "性别:" + commonEmployee.getSex().getDescription() + "\t" + "薪水:" + commonEmployee.getSalary() + "\t"
                + "工作:" + commonEmployee.getJob() + "\t";
        return info;
    }

    public String getManagerInfo(Manager manager) {
        String info = "姓名:" + manager.getName() + "\t" + "性别:" + manager.getSex().getDescription() + "\t" + "薪水:" + manager.getSalary() + "\t"
                + "业绩:" + manager.getPerformance() + "\t";
        return info;
    }


}
