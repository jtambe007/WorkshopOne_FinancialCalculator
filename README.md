# Financial Calculators
## Project requirements

### Mortgage Calculator
- The application would accept three inputs from the user (the principal amount, interest rate, and loan length in years).
- This application is used to calculate out how much a monthly payment for a loan would be (without factoring in insurance or taxes).
- The application would display the expected monthly payment and the total interest to be paid during the term of the loan.
#### Pseudocode
Import all the necessary utilities.
```
import java.util.Scanner;
```
Accept inputs from the user for the principal amount, interest rate, and the length of the loan.
```
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter the principal amount, interest rate, and loan length in years:");
float principal = scanner.nextFloat();
float interestRate = scanner.nextFloat();
float loanLength = scanner.nextFloat();
```
Define variables for calculating monthly payments
```
float monthlyRate = (interestRate/100)/12;
float lengthInMonths = (loanLength*12);
```
Write formula for calculating monthly payments and total interest to be paid
```
double mathPower = Math.pow(1 + monthlyRate, lengthInMonths);
double monthlyPayment = principal * (monthlyRate * mathPower / (mathPower - 1));
double interest = (monthlyPayment*lengthInMonths)-principal;
```
Display the expected monthly payment and the total interest to be paid during the term of the loan
```
System.out.println("A $" + principal + " loan at "  + interestRate + "% interest for " + loanLength + " years " + "would have a " + String.format("$%.2f", monthlyPayment) + " monthly payment with a total interest of " + String.format("$%.2f", interest));

```

### Future Value Calculator
- The application establishes the future value of a one-time deposit using daily compounding interest and determines how much it will be worth as it matures.
- The application would accept three inputs from the user (the deposit, interest rate, and number of years). 
- This application is used to display the future value and the total interest earned.

#### Pseudocode
Import all the necessary utilities.
```
import java.util.Scanner;
```
Accept inputs from the user for the deposit amount, interest rate, and the desired number of years.
```
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter the deposit amount, interest rate, and the desired number of years: ");
float depositAmount = scanner.nextFloat();
float interestRate = scanner.nextFloat();
float numOfYears = scanner.nextFloat();
```
Define variables for calculating the future value of a one-time deposit
```
double compoundInterest = depositAmount * (Math.pow((1+(interestRate/100)/365), (numOfYears*365)));
double totalInterest = compoundInterest - depositAmount;
```
Display the expected future value and the total interest to be earned during the term of the investment
```
System.out.println("If you deposit $" + depositAmount + " in a CD that earns " + interestRate + "% interest " + "and " + "matures in " + numOfYears + " years, your CD's ending balance will be " + String.format("$%.2f", compoundInterest) + " and you would have earned " + String.format("$%.2f", totalInterest) + " in " + "interest.");
```
