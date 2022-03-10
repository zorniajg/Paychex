package paychecks;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * On my honor, I have neither given nor received any unauthorized aid on this
 * assignment.
 * 
 * Paychex class which contains the main method for running the paychecks
 * program. Constructs a payroll that can consist of multiple departments and
 * employees and prints out the salary report. It can be printed to a file if
 * one is provided in the arguments when Paychex is run.
 * 
 * @author Jacob Zorniak
 * @version 10/04/2019
 */
public class Paychex 
{
	/**
	 * The main method for Paychex.
	 * 
	 * @param args Optional file name as argument
	 */
	public static void main(String[] args) 
	{
		//Create payroll object
		Payroll payroll = new Payroll();

		//Create an imaginary payroll with multiple departments and employees
		Department ui = new Department("ui");
		Developer john = new Developer("John", 50000);
		Developer sarah = new Developer("Sarah", 50000);
		Manager gilgamesh = new Manager("Gilgamesh", 90000, ui);

		Department popUps = new Department("PopUps");
		Developer melvin = new Developer("Melvin", 65000);

		Department algorithms = new Department("Algorithms");
		Developer garry = new Developer("Garry", 75000);

		//Add employees to the appropriate departments
		ui.add(john);
		ui.add(sarah);
		ui.add(gilgamesh);
		popUps.add(melvin);
		ui.add(popUps);

		algorithms.add(garry);

		//Add the departments to the payroll.
		payroll.add(ui);
		payroll.add(algorithms);

	    //Check if an output file was provided.
		if (args.length > 0) 
		{
			FileOutputStream outputFile;
			PrintStream output;
			//Try to open the provided file and an output stream to write to it, 
			//write the salary report, and close the stream
			try 
			{
				outputFile = new FileOutputStream(args[0]);
				output = new PrintStream(outputFile);
				payroll.printSalaryReport(output, 0);
				output.close();
			} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			}
		} 
		else 
		{
			//If there is no output file provided, print to stdout
			payroll.printSalaryReport(System.out, 0);
		}
	}
}
