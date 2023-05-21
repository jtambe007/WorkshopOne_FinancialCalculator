package com.jt;

import java.util.Scanner;

public class FutureValueCalculator {
    public static void main(String[] args) {
        // Accept inputs from the user for the deposit amount, interest rate, and the desired number of years.
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter the deposit amount, interest rate, and the desired number of years: ");
       float depositAmount = scanner.nextFloat();
       float interestRate = scanner.nextFloat();
       float numOfYears = scanner.nextFloat();

       // Define variables for calculating the future value of a one-time deposit
       double compoundInterest = depositAmount * (Math.pow((1+(interestRate/100)/365), (numOfYears*365)));
       double totalInterest = compoundInterest - depositAmount;

       // Display the expected future value and the total interest to be earned during the term of the investment
       System.out.println("If you deposit $" + depositAmount + " in a CD that earns " + interestRate + "% interest " +
                "and " + "matures in " + numOfYears + " years, your CD's ending balance will be " + String.format("$%.2f",
                compoundInterest) + " and you would have earned " + String.format("$%.2f", totalInterest) + " in " +
                "interest.");
    }
}
