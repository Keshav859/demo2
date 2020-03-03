package EmployeeQuestion;

public abstract class Employee {
    public String name;
    public String reportsTo;
    public abstract void calculateSalary();

    public Employee(String name) {
        this.name = name;
    }
}	