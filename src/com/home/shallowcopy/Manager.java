package com.home.shallowcopy;

public class Manager extends Human implements Cloneable {

    private Double salary;
    private Department department;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager [salary=" + salary + ", department=" + department 
                 + super.toString() +"]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
