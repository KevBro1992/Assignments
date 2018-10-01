/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeenrollment;

/**
 *
 * @author brownek
 */
public abstract class Employee implements IEmployee {
    //why does the IDE want to make the variables final?
    private String name;
    private int employeeType;
    private int age;
    private int salary;
    private boolean active = false;
    
    public Employee (String name, int employeeType, int age, int salary) {
        this.name = name;
        this.employeeType = employeeType;
        this.age = age;
        this.salary = salary;
    }
    
    @Override
    public void displayEmployee() {
        System.out.println("Name: " + this.name);
        System.out.println("EmpType: " + this.employeeType);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
    }
    @Override
    public void activateEmployee() {
        active = true;
    }
    @Override
    public void deactivateEmployee() {
        active = false;
    } 
    public void setSalary(int salary) throws Exception {
        if (salary < 10000) {
            throw new IllegalArgumentException("salary too low");
        }
        else if (salary > 100000) {
            throw new IllegalArgumentException("salary too high");
        }
        else if (employeeType == MANAGER && salary < 2000) {
            throw new IllegalArgumentException("salary not enough");
        }
        else if (employeeType == DEVELOPER && salary > 3000) {
            throw new IllegalArgumentException("salary out of range");
        }
        else if (employeeType == EXEC && salary < 50000 ) {
            throw new IllegalArgumentException("salary not enough");
        }
    }
    
    @Override
    public String toString() {
        String details = name + " " + employeeType + " " + age + " " + salary + " " + active;
        return details;
    }
    
    public boolean equals(Employee emp) {
        if(emp == this) {
            return true;
        } else {
            return false;
        }
    }
}
