package paychecks;

/**
 * Developer class that is a subclass of Employee.
 * 
 * @author Jacob Zorniak
 * @version 10/04/2019
 */
public class Developer extends Employee
{
    /**
     * Constructs a developer object.
     * 
     * @param name The name of the developer/employee
     * @param salary The salary of the developer/employee
     */
    public Developer(String name, int salary)
    {
        super(name, salary);
    }

    /**
     * @return Returns a string describing the employee's title - developer.
     */
    String getTitle()
    {
        return "Developer";
    }

    /**
     * @return Returns the bonus an employee with the title developer receives.
     */
    int getBonus()
    {
        return 5000;
    }
}
