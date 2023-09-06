/*
 * Created by: Jacob Roe
 * Created On: 9/26/2022
 * 
 * Modification Log
 * Date			Programmer		Description
 * 9/26/2022	Jacob Roe		Initial Implementation
 * 
 * Description: A program to prompt the user to select a package, enter hours used, and display total charges
 */
package provider;

import java.util.Scanner;

public class displayCharges {

	public static void main(String[] args) {
		
		
		packageCalculator charge = new packageCalculator();
		
		//Call setCharge Method
		charge.setCharge();
		
		//Display the total charges
		System.out.println("Your total charges: " + charge.getCharge());
	}
	
	//Method to set and get package choice
	public static char getPackage() {
		
		char Package;
		
		Scanner keyboard = new Scanner(System.in);
		
		//What package types do we offer?
		//A = smallest, B = Medium, C = Largest
		System.out.println("Please Select a Package!");
		System.out.println("Type A for $9.95 per month for 10 hours");
		System.out.println("Type B for $14.95 per month for 20 hours");
		System.out.println("Type C for 19.95 per month for unlimited: ");
				
		//Create a keyboard variable for capturing values entered		
		Package = keyboard.next().charAt(0);
		
		return Package;
		
	}
	
	//Method to set and get hours input
	public static double getHours() {
		
		double Hours; 
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt user for how many hours they have used
		System.out.print("Please enter the number of hours used: ");
				
		//How many hours are used
		Hours = keyboard.nextInt();
		
		return Hours;
		
	}
	
}
