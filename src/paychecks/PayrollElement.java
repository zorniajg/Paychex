package paychecks;

import java.io.PrintStream;

/**
 * Interface for objects that are payroll elements-employees and departments.
 * 
 * @author Jacob Zorniak
 * @version 10/04/2019
 *
 */
interface PayrollElement 
{

	/**
	 * Returns the total salaries of an object that implements PayrollElement.
	 * 
	 * @param includeBonus Boolean determining if the total should include bonuses
	 * @return The total salaries for that payroll element
	 */
	public int getTotalSalaries(boolean includeBonus);
	
	/**
	 * Prints out the salary report for a payroll element to the provided 
	 * PrintStream with the provided indentation.
	 * 
	 * @param out The appropriate PrintStream
	 * @param indent The appropriate indentation
	 */
	public void printSalaryReport(PrintStream out, int indent);
}
