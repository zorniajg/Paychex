package paychecks;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Payroll class that contains a list of payroll elements (employees and departments) 
 * and methods to act upon the list.
 * 
 * @author Jacob Zorniak
 * @version 10/04/2019
 */
public class Payroll implements PayrollElement
{
    private ArrayList<PayrollElement> elements;

    /**
     * Constructs a payroll object.
     */
    public Payroll()
    {
        elements = new ArrayList<PayrollElement>();
    }

    /**
     * Adds a payroll element object to the list of elements.
     * 
     * @param element The element to add to the payroll elements
     */
    public void add(PayrollElement element)
    {
        elements.add(element);
    }

    /**
     * Returns the list of payroll elements.
     * 
     * @return The list of payroll elements
     */
    public ArrayList<PayrollElement> getElements()
    {
        return elements;
    }
    
    /**
     * Returns the name of the payroll- "Payroll".
     * @return String containing the word " Payroll"
     */
    public String getName()
    {
    	return "Payroll";
    }
    
	@Override
	public int getTotalSalaries(boolean includeBonus) 
	{
		int sum = 0;
		
		for(PayrollElement element: elements)
		{
			if(includeBonus)
				sum += element.getTotalSalaries(true);
			else
				sum += element.getTotalSalaries(false);
		}
		return sum;
	}
	
	@Override
	public void printSalaryReport(PrintStream out, int indent) 
	{	
		int indentation = indent;
		for(int i = 0; i < indentation; i++)
		{
			out.print(" ");
		}
		out.println(this.getName() + ", total = $" + this.getTotalSalaries(true));
		indentation += 3;
		for(PayrollElement element: elements)
		{
			element.printSalaryReport(out, indentation);
		}
		
	}
}
