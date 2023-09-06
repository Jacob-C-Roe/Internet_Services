/*
 * Created by: Jacob Roe
 * Created On: 9/26/2022
 * 
 * Modification Log
 * Date			Programmer		Description
 * 9/26/2022	Jacob Roe		Initial Implementation
 * 
 * Description: A program to store which package was selected, the hours that were used, and calculate the total charges for an Internet service provider
 */
package provider;

public class packageCalculator {

	private double charges;
	
	//Constructor
	packageCalculator() {
		
		charges = 0.0;
		
	}
	
	//Method to set the total charge amount
	public void setCharge() {
		
		char type;
		double hours;
		
		type = displayCharges.getPackage();
		
		hours = displayCharges.getHours();
		
		//Calculate the package rate - depending on type and hours used
		if (type =='A' || type =='a')
			if(hours < 10)
				charges = 9.95;
			else
				charges = 9.95 + 2.00 * (hours - 10);
		else if(type == 'B' || type == 'b')
			if (hours < 20)
				charges = 14.95;
			else
				charges = 14.95 + 1.00 * (hours - 20);
		else if(type == 'C' || type == 'c')
			charges = 19.95;
		
	}
	
	//Method to get the total charge amount
	public double getCharge() {
		
		return this.charges;
		
	}
	
}
