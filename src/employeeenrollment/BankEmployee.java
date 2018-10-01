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
public class BankEmployee extends Employee {
    
    private String bankName;
    
    public BankEmployee(String name, int employeeType, int age, int salary) {
        super(name, employeeType, age, salary);
    }
    
    public BankEmployee(String name, int employeeType, int age, int salary, String bankName) {
        super(name, employeeType, age, salary);
        this.bankName = bankName;
    }
    
    @Override
    public void displayEmployee() {
        super.displayEmployee();
        System.out.println("Bankname: " + this.bankName);
    }
    
    @Override
    public String toString() {
        String details = super.toString();
        return details + " " + bankName;
    }
}
