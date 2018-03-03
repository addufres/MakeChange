## Make Change Project

### Skill Distillery Week 1 Homework

Program to calculate change.

#### Project Description
This program makes change out of the amount tendered for a product.
It is an automatic program with everything past the user input handled by learned java techniques.

It uses: 
* Objects that I make to do the calculations away from my MakeChange class allowing for a cleaner code.
** The object class holds two methods.
*** One method to calculate the denominations of bills and coins. 
*** The second method is called by the first and prints everything out.
* If/Else statements nested within each other helping to make decisions about the cents and dollars individually.
* Taking input from a user through the user of the Scanner object.
* I cast ints using (int) in order to go from 'x.00' dollar amount to 'x00.00'. 
* Call methods with parameters and call methods from objects.

##### Logic of calculations
Starting with the changeDue convert it to 'pennies' i.e. changeDue  = 4.00 ------> changeDue = 400.00
After that begin with the largest denomination i.e. twenties. 
1. To find the number of bills, I divide changeDue by the denomination of the variable you use.							
2. To find remaining number of pennies subtract the product of the denomination and bill from the original changeDue.  	
3. To find each remaining bill and coin, continue plugging in the values replacing the bill 
									i.e. billOrCoin  = changeDue / denomination
									i.e. newChange = changeDue - (denomination * billOrCoin)
									
#### How To Run This Project
Run this through the console in eclipse or the terminal by going to the proper directory and type ```java MakeChange```


#### Lessons Learned

I learned about how to eliminate possibilities and use the modulo '%' symbol to work through different powers in a number system. 
I also incorporated an object class I wrote and created in the if/else statement for the static method in my MakeChange class.
I am starting to be able to conceptualize a visual mental model of my program which has proven helpful in sorting through the logic 
problems like this one.  