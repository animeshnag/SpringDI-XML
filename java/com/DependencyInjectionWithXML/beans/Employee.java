package com.animesh;
import java.util.List;

public class Employee {

    private String name;
    private Integer age;
    private Double salary;
    private Department department;
    private List al;

    public void setAl(List al) {
        this.al = al;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(Integer age, Double salary, Department department) {
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public void print(){
        System.out.println(al);
    }

    public String toString() {
        return "Name\tAge\tSalary\tDepartment\n" + name + "\t\t" + age + "\t" + salary + "\t" + department;
    }
}
