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
public interface IEmployee {
    
    int MANAGER = 10;
    int DEVELOPER = 20;
    int EXEC = 30;
    
    public void displayEmployee();
    public void activateEmployee();
    public void deactivateEmployee();
}
