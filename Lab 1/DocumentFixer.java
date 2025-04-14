/* "I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone." */

import java.io.*;
import java.util.Scanner;




public class DocumentFixer {
	public static void main(String[] args) throws IOException { // main method
		fixDocument("employees.txt"); // calling the method document and setting it to the current txt file to update info \n
					      // While catching any IOExceptions 
	}
	
	public static void fixDocument(String fileName) throws IOException { // fixDocument method with an argument fileName to read \n 
									     // the file employees.txt and update info
		File myFile = new File(fileName); // creating the file class

		Scanner scan = new Scanner(myFile); // creating the scanner class

		String[] employeeNames = new String[483]; 

		
		String[] employeeIDs = new String[483]; // declaring the eployee's names and IDs and their salaries into arrays and declaring how
							// many employess there are going to be
		
		int [] employeeSalaries = new int[483];

		for (int i = 0; i < 483; i++){
			
			String line = scan.nextLine(); // sacns each line

						
			String[] tokens = line.split(","); // puts i numbers into arrays 

		       	employeeNames[i] = tokens[0]; // putting all of the employee names into index zero of the array

			employeeIDs[i] = tokens[1]; // putting all of the eployee's IDs into index 1 of the array 

			
			String SalaryString = tokens[2].substring(1); // Now swaps array index, instead salary array being 2nd it will instead first

			int salary = Integer.parseInt(SalaryString);

			int salaryUpdate = (int)(salary * 1.03); // updating the current peoples salaries by 1.03
			employeeSalaries[i] = salaryUpdate; // all employees salries added to the array but also changing their salarie amount

				
				




		}
	scan.close();
	

	FileWriter writer = new FileWriter("EmployeesUpdatedSalaries.txt"); // declaring a new txt file to update information 

	for (int i = 0; i < 483; i++){ // calling a for loop for all emplpoyees's updated information
		String upLine = employeeNames[i] + ", $" + employeeSalaries[i] + "," + employeeIDs[i] + "\n"; // formatting the array

		writer.write(upLine); // writing the txt file
		}
	writer.close(); // closing the file
	}
}


	


