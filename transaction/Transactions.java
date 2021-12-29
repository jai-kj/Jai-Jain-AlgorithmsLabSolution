package com.greatlearning.lab2.transaction;

import java.util.Scanner;

public class Transactions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the transaction array");
		int n = sc.nextInt();
		
		int transactionArray[] = new int[n];
		System.out.println("Enter the values of array");
		for(int i = 0; i < n; i++)
			transactionArray[i] = sc.nextInt();
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targets = sc.nextInt();
		
		while(targets-- > 0) {
			System.out.println("Enter the value of target");
			int target = sc.nextInt();
			
			int sum = 0, flag = 0;
			for(int i = 0; i < n; i++) {
				if(sum >= target) {
					System.out.println("Target achieved after " + i + " transactions");
					flag = 1;
					break;
				}
				else sum += transactionArray[i];
			}
			
			if(flag == 0)
				System.out.println("Given target is not achieved");
		}
		
		System.out.println("You have completed your target check!");
		sc.close();
	}
}
