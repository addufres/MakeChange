// TODO Denominations that are not used should not be displayed. DONE IN CalculatorForRegister.java ie cfr object
package com.skilldistillery.projects.makechange;

import java.util.Scanner;

public class MakeChangeRegister {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CalculatorForRegister cfr = new CalculatorForRegister();
		double itemPrice, amountTendered;

		System.out.print("Please enter the price of the item: $");
		itemPrice = input.nextDouble();
		System.out.println();
		System.out.print("Please enter the amount tendered: $");
		amountTendered = input.nextDouble();

		if (itemPrice > amountTendered) {
			System.err.println("Put item back...Not enough funds.");
		} else if (itemPrice == amountTendered) {
			System.out.println("The price was: $" + itemPrice + "\nYou tendered: $" + amountTendered
					+ "\nThank you for exact change. Enjoy your purchase.");
		} else {
			double changeDue = Math.ceil((amountTendered - itemPrice) * 100);
			System.out.println("Your change is:\n________________________\n");
			if (changeDue < 100 && changeDue >= 60) {
				cfr.lessThanADollarMoreThan60Cents(changeDue);
			} else if (changeDue < 100 && changeDue < 60) {
				cfr.lessThanADollarLessThan60Cents(changeDue);
			} else {
				int cents = (int) (changeDue % 100);
				if (cents >= 60) {
					cfr.MoreThanADollarMoreThan60Cents(changeDue, cents);
				} else {
					cfr.MoreThanADollarLessThan60Cents(changeDue, cents);
				}
			}
		}
	}
}