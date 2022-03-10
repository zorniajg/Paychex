package paychecks;

/**
 * Department class which extends the Payroll class and also stores the name of the department.
 * 
 * @author Jacob Zorniak
 * @version 10/04/2019
 *
 */
public class Department extends Payroll
{
	private String name;
	
	/**
	 * Constructs a Department object.
	 * 
	 * @param name The name of the department
	 */
	public Department(String name)
	{
		this.name = name;
	}
	
	/**
	 * Returns the name of the department.
	 * 
	 * @return the name of the department
	 */
	public String getName()
	{
		return name;
	}
}
