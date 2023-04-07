package com.design.patterns.core.visitor;

/**
 * Created by lihongming on 16/6/21.
 */
public abstract class Employee {

    /**
     * 性别
     */
    public enum Sex {
        MALE("男"),
        FEMALE("女");

        private String description;

        Sex(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    private String name;

    /**
     * 薪水
     */
    private int salary;

    private Sex sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public abstract void accept(IVisitor visitor);
}
