package com.skilldistillery.projects.makechange;

public class CalculatorForRegister {
	public void calcForBillsAndCoins(double changeDue) {
		
	}
	public void lessThanADollarMoreThan60Cents(double changeDue) {
		int cents = (int)(changeDue % 100);
		int dollars = 0;
			
		int twenties = (int) (dollars / 20);
		int tensFivesSingles = dollars - (twenties*20);
		System.out.println("Twenties: " + twenties);
			
		int tens = (int)(tensFivesSingles / 10);
		int fivesSingles = tensFivesSingles - (tens*10);
		System.out.println("Tens: " + tens);
			
		int fives = (int)(fivesSingles / 5);
		int singles = fivesSingles - (fives*5);
		System.out.println("Fives: " + fives + "\nSingles: " + singles);
			
		int quarters = (int)(cents / 25);
		double dimesNickelsPennies = cents - (quarters*25);
		System.out.println("Quarters: " + quarters);
			
		int dimes = (int)(dimesNickelsPennies / 10);
		double nickelsPennies = dimesNickelsPennies - (dimes*10);
		System.out.println("Dimes: " + dimes);
			
		int nickels = (int)(nickelsPennies / 5);
		int pennies = ((int)(nickelsPennies) - (nickels*5));
		System.out.println("Nickels: " + nickels + "\nPennies:" + pennies);
	}
	
	public void lessThanADollarLessThan60Cents(double changeDue) {
		int cents = (int)(changeDue % 100);
		int dollars = 0;
			
		int twenties = (int) (dollars / 20);
		int tensFivesSingles = dollars - (twenties*20);
		System.out.println("Twenties: " + twenties);
			
		int tens = (int)(tensFivesSingles / 10);
		int fivesSingles = tensFivesSingles - (tens*10);
		System.out.println("Tens: " + tens);
			
		int fives = (int)(fivesSingles / 5);
		int singles = fivesSingles - (fives*5);
		System.out.println("Fives: " + fives + "\nSingles: " + singles);
			
		int quarters = (int)(cents / 25);
		double dimesNickelsPennies = cents - (quarters*25);
		System.out.println("Quarters: " + quarters);
			
		int dimes = (int)(dimesNickelsPennies / 10);
		double nickelsPennies = dimesNickelsPennies - (dimes*10);
		System.out.println("Dimes: " + dimes);
			
		int nickels = (int)(nickelsPennies / 5);
		int pennies = (int)(nickelsPennies) - (nickels*5);
		System.out.println("Nickels: " + nickels + "\nPennies:" + pennies);
	}
	
	public void MoreThanADollarMoreThan60Cents(double changeDue, int cents) {
		int dollars = (int)(Math.floor((changeDue - cents)/100));
		int twenties = (int) (dollars / 20);
		int tensFivesSingles = dollars - (twenties*20);
		System.out.println("Twenties: " + twenties);
			
		int tens = (int)(tensFivesSingles / 10);
		int fivesSingles = tensFivesSingles - (tens*10);
		System.out.println("Tens: " + tens);
			
		int fives = (int)(fivesSingles / 5);
		int singles = fivesSingles - (fives*5);
		System.out.println("Fives: " + fives + "\nSingles: " + singles);
			
		int quarters = (int)(cents / 25);
		double dimesNickelsPennies = cents - (quarters*25);
		System.out.println("Quarters: " + quarters);
			
		int dimes = (int)(dimesNickelsPennies / 10);
		double nickelsPennies = dimesNickelsPennies - (dimes*10);
		System.out.println("Dimes: " + dimes);
			
		int nickels = (int)(nickelsPennies / 5);
		int pennies = (int)(nickelsPennies) - (nickels*5);
		System.out.println("Nickels: " + nickels + "\nPennies:" + pennies);
	}
	
	public void MoreThanADollarLessThan60Cents(double changeDue, int cents) {
		int dollars = (int)(Math.floor((changeDue - cents)/100));		
		int twenties = (int) (dollars / 20);
		int tensFivesSingles = dollars - (twenties*20);
		System.out.println("Twenties: " + twenties);
			
		int tens = (int)(tensFivesSingles / 10);
		int fivesSingles = tensFivesSingles - (tens*10);
		System.out.println("Tens: " + tens);
			
		int fives = (int)(fivesSingles / 5);
		int singles = fivesSingles - (fives*5);
		System.out.println("Fives: " + fives + "\nSingles: " + singles);
			
		int quarters = (int)(cents / 25);
		double dimesNickelsPennies = cents - (quarters*25);
		System.out.println("Quarters: " + quarters);
			
		int dimes = (int)(dimesNickelsPennies / 10);
		double nickelsPennies = dimesNickelsPennies - (dimes*10);
		System.out.println("Dimes: " + dimes);
			
		int nickels = (int)(nickelsPennies / 5);
		int pennies = ((int)(nickelsPennies) - (nickels*5));
		System.out.println("Nickels: " + nickels + "\nPennies:" + pennies);
	}
}
