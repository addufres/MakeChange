package com.skilldistillery.projects.makechange;

public class CalculatorForRegister {

	public void lessThanADollarMoreThan60Cents(double changeDue) {
		int cents = (int) (changeDue % 100) + 1;
		int dollars = 0;
		int twenties = (int) (dollars / 20);
		int tensFivesSingles = dollars - (twenties * 20);
		int tens = (int) (tensFivesSingles / 10);
		int fivesSingles = tensFivesSingles - (tens * 10);
		int fives = (int) (fivesSingles / 5);
		int singles = fivesSingles - (fives * 5);
		int quarters = (int) (cents / 25);
		double dimesNickelsPennies = cents - (quarters * 25);
		int dimes = (int) (dimesNickelsPennies / 10);
		double nickelsPennies = dimesNickelsPennies - (dimes * 10);
		int nickels = (int) (nickelsPennies / 5);
		int pennies = ((int) (nickelsPennies) - (nickels * 5));

		printIfStatement(twenties, tens, fives, singles, quarters, dimes, nickels, pennies);
	}

	public void lessThanADollarLessThan60Cents(double changeDue) {
		int cents = ((int) (changeDue % 100));
		int dollars = 0;
		int twenties = (int) (dollars / 20);
		int tensFivesSingles = dollars - (twenties * 20);
		int tens = (int) (tensFivesSingles / 10);
		int fivesSingles = tensFivesSingles - (tens * 10);
		int fives = (int) (fivesSingles / 5);
		int singles = fivesSingles - (fives * 5);
		int quarters = (int) (cents / 25);
		double dimesNickelsPennies = cents - (quarters * 25);
		int dimes = (int) (dimesNickelsPennies / 10);
		double nickelsPennies = dimesNickelsPennies - (dimes * 10);
		int nickels = (int) (nickelsPennies / 5);
		int pennies = (int) (nickelsPennies) - (nickels * 5);
		
		printIfStatement(twenties, tens, fives, singles, quarters, dimes, nickels, pennies);
	}

	public void MoreThanADollarMoreThan60Cents(double changeDue, int cents) {
		int dollars = (int) (Math.floor((changeDue - cents) / 100));
		int twenties = (int) (dollars / 20);
		int tensFivesSingles = dollars - (twenties * 20);
		int tens = (int) (tensFivesSingles / 10);
		int fivesSingles = tensFivesSingles - (tens * 10);
		int fives = (int) (fivesSingles / 5);
		int singles = fivesSingles - (fives * 5);
		int quarters = (int) (cents / 25);
		double dimesNickelsPennies = cents - (quarters * 25);
		int dimes = (int) (dimesNickelsPennies / 10);
		double nickelsPennies = dimesNickelsPennies - (dimes * 10);
		int nickels = (int) (nickelsPennies / 5);
		int pennies = (int) (nickelsPennies) - (nickels * 5);

		printIfStatement(twenties, tens, fives, singles, quarters, dimes, nickels, pennies);
	}

	public void MoreThanADollarLessThan60Cents(double changeDue, int cents) {
		int dollars = (int) (Math.floor((changeDue - cents) / 100));
		int twenties = (int) (dollars / 20);
		int tensFivesSingles = dollars - (twenties * 20);
		int tens = (int) (tensFivesSingles / 10);
		int fivesSingles = tensFivesSingles - (tens * 10);
		int fives = (int) (fivesSingles / 5);
		int singles = fivesSingles - (fives * 5);
		int quarters = (int) (cents / 25);
		double dimesNickelsPennies = cents - (quarters * 25);
		int dimes = (int) (dimesNickelsPennies / 10);
		double nickelsPennies = dimesNickelsPennies - (dimes * 10);
		int nickels = (int) (nickelsPennies / 5);
		int pennies = ((int) (nickelsPennies) - (nickels * 5));
		
		printIfStatement(twenties, tens, fives, singles, quarters, dimes, nickels, pennies);
	}

	public void printIfStatement(int twenties, int tens, int fives, int singles, int quarters, int dimes, int nickels, int pennies) {
		if (twenties != 0) {
			System.out.println("Twenty Dollar Bills: " + twenties);
		} 
		if (tens != 0) {
			System.out.println("Ten Dollar Bills: " + tens);
		}
		if (fives != 0) {
			System.out.println("Five Dollar Bills: " + fives);
		}		
		if (singles != 0) {
			System.out.println("Singles: " + singles);
		}
		if (quarters != 0) {
			System.out.println("Quarters: " + quarters);
		}
		if (dimes != 0) {
			System.out.println("Dimes: " + dimes);
		}
		if (nickels != 0) {
			System.out.println("Nickels: " + nickels);
		}
		if (pennies != 0) {
			System.out.println("Pennies:" + pennies);
		}
	}
}
