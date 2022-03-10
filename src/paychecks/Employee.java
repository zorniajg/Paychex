package paychecks;

import java.io.PrintStream;

/**
 * Employee class which is an abstract class containing attributes and methods
 * for an employee (manager or developer) - name, salary, title, bonus. 
 * Also implements the PayrollElement interface.
 * 
 * @author Jacob Zorniak
 * @version 10/04/2019
 */
public abstract class Employee implements PayrollElement
{
    private String name;
    private int salary;

    /**
     * Constructs an employee object.
     * 
     * @param name The name of the employee
     * @param salary The salary of the employee
     */
    public Employee(String name, int salary)
    {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Returns the name of the employee.
     * 
     * @return Employee's name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the salary of the employee.
     * 
     * @return Employee's salary
     */
    public int getSalary()
    {
        return salary;
    }

    /**
     * Abstract method for getting an employee's title - manager or developer.
     * 
     * @return The employee's title
     */
    abstract String getTitle();

    /**
     * Abstract method that returns an employee's bonus based on their title.
     * 
     * @return The employee's bonus
     */
    abstract int getBonus();
    
    @Override
	public int getTotalSalaries(boolean includeBonus) 
	{
		if(includeBonus)
			return this.getSalary() + this.getBonus();
		else
			return this.getSalary();
	}

	@Override
	public void printSalaryReport(PrintStream out, int indent) 
	{
		for(int i = 0; i < indent; i++)
			out.print(" ");
		out.println(this.getName() + ", " + this.getTitle() + ", $" + this.getTotalSalaries(true));
	}
}
