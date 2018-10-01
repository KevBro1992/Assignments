Goal: Create Employee enrollment system for the Bank

Tasks:

1. Create IEmployee interface
	IEmployee contains three methods
	a. displayEmployee
	b. activateEmployee
	c. deactivateEmployee
	
	IEmployee contains three employee type constants

	a. int MANAGER = 10
	b. int DEVELOPER = 20
	c. int EXEC = 30 
 
2. Create abstract class Employee which implements IEmployee interface
	Employee contains 5 instance variables
	String name;
	int employeeType;
	int salary;
	int age;
	boolean active = false; 

	add necessary constructors. 
 
	implement methods
	a. displayEmployee - displays all the instance variable values
	b. activateEmployee - set boolean variable active to true 
	c. deactivateEmployee - set boolean variable active to false
	
	add method
	a. setSalary (int amount)
		if amount < 10000 then throw checked exception with message "salary too low" 
		if amount > 100000 then throw checked exception with message "salary too high" 

		if employeeType == MANAGER and salary < 20000 then throw exception "salary not enough"
		if employeeType == DEVELOPER and salary > 30000 then throw exception "salary out of range" 
		if employeeType == EXEC and salary < 50000 then throw exception "salary not in range" 
	b. implement toString function 
		must return all employee data in string format
	c. implement equals function which accepts Employee obj as parameter  
		if name, age and employeeType and salary of obj are same as this employee then return true else return false 
	

3. create class BankEmployee which extends Employee abstract class
	BankEmployee contains one instance variable
		String bankName

	implement necessary constructors

	implement displayEmployee and print all employee data 
	
	implement toString function 
		must return all employee data in string format

4. create EnrollEmployee class
	create main entry function
	Instantiate 3 employees
	
	1. BankEmployee bob;
	2. BankEmployee jerry;
	3. BankEmployee tom; 
	
	intantiate all three bank employees with the data below
	bob  name = "Bob",  employee type = MANAGER, age = 30, salary = 30000 
	jerry name = "Jerry",  employee type = DEVELOPER, age = 20, salary = 20000 
	tom name = "Tom",  employee type = EXEC, age = 40, salary = 50000
	
	activate all employees 
	
	execute display funtion on all objects

	deactivate bob
	
	4. Instantiate another BankEmployee 
	   
		BankEmployee newOne = bob;
		
		use equals to check if newOne is equal to bob
	
	
	catch exceptions for all of the below 

	set salary of newOne to 10000
	set salary of tom to 40000
	set salary of jerry to 50000
	
	set salary of jerry to 1000

	set salary of tom to 200000

	
	use System.out.println to print all employees 

	ie System.out.println(bob) must print all the data of bob
