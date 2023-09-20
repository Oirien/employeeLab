package com.codebase.management;

import com.codebase.Employee;

public class Manager extends Employee {
    String deptName;

    public Manager(String name, String NINumber, int salary, String deptName) {
        super(name, NINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
