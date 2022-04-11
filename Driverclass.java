package com.greatlearning.currencydenomination;

import java.util.Scanner;

import paymentcurrencyDenomination.NoteDenomination;

public class Driverclass {

	public static void main(String[] args) {
		System.out.println("Enter the size of currency denomination: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the currency denomination value: ");
		for(int i=0;i<size;i++) {
			int value = sc.nextInt();
			arr[i] = value;
		}
		System.out.println("Enter the amount you want to pay: ");
		int amount = sc.nextInt();
		NoteDenomination.minimumDenomination(arr, amount);
		sc.close();
	}
}
