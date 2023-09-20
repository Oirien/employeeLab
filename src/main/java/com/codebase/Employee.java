package com.codebase;

public abstract class Employee {
    String name;
    String NINumber;
    int salary;

    public Employee(String name, String NINumber, int salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNINumber() {
        return NINumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(double raise){
        if (raise >= 0){
        int salaryIncrease = (int) raise;
        setSalary(getSalary() + salaryIncrease);
        }
    }

    public int payBonus(){
        return getSalary()/100;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
}
