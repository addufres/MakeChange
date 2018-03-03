//Overview
//In the cash register we will calculate the amount of change returned to a customer 
//based on the purchase price and the amount tendered. We will also notify the attendant 
//how many of each piece of currency ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed 
//to make the change for the customer. Change should be provided using the largest bill and 
//coin denominations as possible. Denominations that are not used should not be displayed.
//
//
//User Story #1
//The user is prompted asking for the price of the item.
//
// DONE
//
//User Story #2
//The user is then prompted asking how much money was tendered by the customer.
//
// DONE
//
//User Story #3
//Display an appropriate message if the customer provided too little money or the exact amount.
//
// DONE
//
//User Story #4
//If the amount tendered is more than the cost of the item, display the number of bills and coins 
//that should be given to the customer.

package MakeChange;

import java.util.Scanner;

public class MakeChangeRegister {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the price of the item: $");
		double itemPrice = input.nextDouble();
		System.out.println();
		System.out.println("Please enter the amount tendered: ");
		double amountTendered = input.nextDouble();

		if (itemPrice > amountTendered) {
			System.out.println("Put item back...Not enough funds.");
		} else if (itemPrice == amountTendered) {
			System.out.println("The price was: $" + itemPrice + "\nYou tendered: $" + amountTendered
					+ "\nThank you for exact change. Enjoy your purchase.");
		}

	}

}
