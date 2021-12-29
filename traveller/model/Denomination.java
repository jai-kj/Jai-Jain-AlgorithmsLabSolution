package com.greatlearning.lab2.traveller.model;

public class Denomination {

	public void getNotesCount(int [] sortedDenominations, int n, int amount) {
		try {
			System.out.println("Your payment approach in order to give min no of notes will be");
			
			// Logic
			for(int i = 0; i < n; i++) {
				if(amount == 0) break;
				
				int current = sortedDenominations[i];
				int quotient = amount / current;
				
				if(quotient > 0) {
					amount -= current * quotient;
					System.out.println(current + ":" + quotient);
				}
			}	
			
			if(amount != 0) 
				System.out.println("Exact amount cannot be given with the highest denomination. Not Possible!");
		}
		catch(ArithmeticException e) {
			System.out.println("Denomination with value 0 is invalid!");
		}
	}
}
