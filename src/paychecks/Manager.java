package paychecks;

/**
 * Manager class that is a subclass of Employee.
 * 
 * @author Jacob Zorniak
 * @version 10/04/2019
 */
public class Manager extends Employee
{
	private Department department;

    /**
     * Constructs a manager object.
     * 
     * @param name The name of the manager/employee
     * @param salary The salary of the manager/employee
     * @param department The department the manager manages
     */
    public Manager(String name, int salary, Department department)
    {
        super(name, salary);
        this.department = department;
    }

    /**
     * @return Returns a string describing the employee's title - manager.
     */
    String getTitle()
    {
        return "Manager";
    }

    /**
     * @return Returns the bonus an employee with the title manager receives.
     */
    int getBonus()
    {
        return (department.getTotalSalaries(false) / 100);
    }
}
