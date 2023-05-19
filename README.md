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
