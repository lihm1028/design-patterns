package com.design.patterns.core.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by lihongming on 16/6/21.
 */
public class Client {

    public static void main(String[] args) {

        mockEmployees().forEach(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                employee.accept(new Visitor());
            }
        });


    }

    private static List<Employee> mockEmployees() {
        List<Employee> employees = new ArrayList<Employee>();

        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setName("张三");
        zhangSan.setSalary(5000);
        zhangSan.setSex(Employee.Sex.MALE);
        zhangSan.setJob("Java工程师");
        employees.add(zhangSan);

        CommonEmployee liSi = new CommonEmployee();
        liSi.setName("李四");
        liSi.setSalary(6000);
        liSi.setSex(Employee.Sex.FEMALE);
        liSi.setJob("页面美工,UI设计师");
        employees.add(liSi);

        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setSalary(10000);
        wangWu.setSex(Employee.Sex.MALE);
        wangWu.setPerformance("合同已签,后续跟进!");

        employees.add(wangWu);
        return employees;
    }
}
