package com.greatlearning.paymoney;

import java.util.Scanner;

public class TransactionCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the transaction array");
		int transSize = sc.nextInt();
		System.out.println("Enter the value of array");
		
		int[] transactions = new int[transSize];
		for(int i=0;i<transSize;i++) {
			transactions[i] = sc.nextInt();
		}
		System.out.println("Enter the total number of targets that needs to be achieved");
		int targetSize = sc.nextInt();
		for(int i=0;i<targetSize;i++) {
			System.out.println("Enter the target value");
			int target = sc.nextInt();
			int result = getNoOfTeansactionsForTarget(transactions,target);
			if(result>0) {
				System.out.println("Target achieved after "+result+" transactions");
			}
			else {
				System.out.println("Given target is not achieved");
			}
		}
		sc.close();
		// TODO Auto-generated method stub

	}
	private static int getNoOfTeansactionsForTarget(int[] transactions,int target) {
		int sum=0;
		for(int i=0;i<transactions.length;i++) {
			sum += transactions[i];
			if(sum >= target) {
				return i+1;
			}
		}
		return -1;
		
	}
}
