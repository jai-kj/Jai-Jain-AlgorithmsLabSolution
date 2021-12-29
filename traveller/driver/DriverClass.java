package com.greatlearning.lab2.traveller.driver;

import java.util.Scanner;

import com.greatlearning.lab2.traveller.model.Denomination;
import com.greatlearning.lab2.traveller.service.MergeSort;

public class DriverClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
		int n = sc.nextInt();
		
		int [] denominations = new int[n];
		System.out.println("Enter the currency denominations value");
		for(int i = 0; i < n; i++)
			denominations[i] = sc.nextInt();

		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		MergeSort mObj = new MergeSort(denominations, n);
		mObj.startMerge(0, n - 1, 'D');
		int sortedDenominations[] = mObj.sorted();	
 
		Denomination denomination = new Denomination();
		denomination.getNotesCount(sortedDenominations, n, amount);	

		sc.close();
	}
}
