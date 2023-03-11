//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		System.out.println("Week 1 Lab");
		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
int planeSeatsAvailable = 64;
		
		// 2. Create a variable to hold the cost of groceries at checkout
double costCheckOutGroceries = 30.65;
		
		// 3. Create a variable to hold a person's middle initial
char middleInitial = 'C'; 
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
boolean isHotOutside = false;
		
		// 5. Create a variable to hold a customer's first name
String customerFirstName = "Christina"; 
		
		// 6. Create a variable to hold a street address
String streetAddress = "Apple Street";

		// 7. Print all variables to the console
System.out.println("Avaiable seats left on the plane:" + planeSeatsAvailable);
System.out.println(costCheckOutGroceries + " is the price for groceries");
System.out.println("The person's middle initial is " + middleInitial);
System.out.println("The customer's first name is " + customerFirstName);
System.out.println (streetAddress + " is where the customer lives");
System.out.println("It is hot outside " + isHotOutside);

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
planeSeatsAvailable = planeSeatsAvailable - 2;
planeSeatsAvailable -=2;
System.out.println(planeSeatsAvailable);

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
//costCheckOutGroceries +=2.15;
costCheckOutGroceries = costCheckOutGroceries + 2.15;
System.out.println(costCheckOutGroceries);

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
middleInitial = 'A'; 		
System.out.println(middleInitial);

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
//isHotOutside = true; 
isHotOutside = !isHotOutside;
System.out.println(isHotOutside);

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
//creating a last name first then do the full name
String customerLastName = "Quez";
System.out.println(customerLastName);
String customerFullName = customerFirstName + " " + middleInitial + " " +  customerLastName;
System.out.println(customerFullName); 

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
String customerIntroduction = "Hi my name is " + customerFullName + " and I live at " + streetAddress + ".";
System.out.println(customerIntroduction);
 		
		
	}
}