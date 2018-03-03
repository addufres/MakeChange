// TODO Denominations that are not used should not be displayed. DONE IN CalculatorForRegister.java ie cfr object
package com.skilldistillery.projects.makechange;

import java.util.Scanner;

public class MakeChangeRegister {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CalculatorForRegister cfr = new CalculatorForRegister();
		double itemPrice, amountTendered;
		System.out.print("Please enter the price of the item: $");
		itemPrice = (input.nextDouble());
		System.out.print("Please enter the amount tendered: $");
		amountTendered = (input.nextDouble());
		if (itemPrice > amountTendered) {
			System.err.println("Put item back...Not enough funds.");
		} else if (itemPrice == amountTendered) {
			System.out.println("The price was: $" + itemPrice + "\nYou tendered: $" + amountTendered + "\nThank you for exact change. Enjoy your purchase.");
		} else {
			itemPrice *= 100;
			amountTendered *= 100;
			int changeDue = ((int)((amountTendered - itemPrice)));
			System.out.println( "     Your change is     \n________________________\n");
			cfr.calculateBillsAndCoins(changeDue);
			}
		input.close();
		}
	}
//}