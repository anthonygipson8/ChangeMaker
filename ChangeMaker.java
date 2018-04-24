package demos;

public class ChangeMaker {

		/*	Problem: Determine what change to give someone
		 	takes user input 
			displays the change breakdown as output*/
		
		/*	1. Understand and Define the Problem 

 			ask user for input, US coins (quarter, dime, nickel, penny),  max change: 99¢  display coin output ,

 			What’s involved?  

			interview users. What are their expectations? What data do they need to access? write a requirements analysis report
		*/
	
		//	Requirements Analysis: Determine how they would like to receive there change and in what currency?

		/*	Inputs: Customer Purchase Amount	
		 	Coin Inputs: Quarters, Dimes, nickels, Pennies* 
		 */
		//	Outputs: Change output in coins: Quarters, dimes, nickels, pennies
		
public static void main(String[] args) {
		
		double amountGiven = 20;
		double price = 19.31;
		
		int remaining = (int) ((amountGiven - price)*100);
		
		System.out.println("Total remaining is "+remaining+" cents");
		
		System.out.println("Quarter is 25 cent");
		System.out.println("Dime is 10 cent");
		System.out.println("Nickel is 5 cent");
		System.out.println("Penny is 1 cent");
		
		
		//finding Quarter ,  1 quarter = 25 cents
		System.out.println("\nCalculating change");
		
		int quarter = 0 ;
		//divide by 25 to get quarters
		quarter = remaining / 25;
		System.out.println("Quarter : "+quarter);

		//subtract quarters and get remain amount
		remaining = remaining - (quarter * 25);

		int dime = 0 ;
		//divide by 10 to get dimes
		dime = remaining / 10;
		System.out.println("Dime : "+dime);

		//subtract dimes and get remain amount
		remaining = remaining - (dime * 10);

		int nickel = 0 ;
		//divide by 5 to get nickels
		nickel = remaining / 5;
		System.out.println("Nickel : "+nickel);

		//subtract nickels and get remain amount
		remaining = remaining - (nickel * 5);
		
		
		int penny = 0 ;
		//divide by 1 to get penny
		penny = remaining / 1;
		System.out.println("penny : "+penny);

		
		
	}

}