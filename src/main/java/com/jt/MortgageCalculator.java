package com.jt;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

//  Accept three inputs from the user (the principal amount, interest rate, and loan length in years)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the principal amount, interest rate, and loan length in years:");
        float principal = scanner.nextFloat();
        float interestRate = scanner.nextFloat();
        float loanLength = scanner.nextFloat();

//  Calculate out how much a monthly payment for a loan would be
        float monthlyRate = (interestRate/100)/12;
        float lengthInMonths = (loanLength*12);

        // Defines formula for calculating mortgage payments
        double mathPower = Math.pow(1 + monthlyRate, lengthInMonths);
        double monthlyPayment = principal * (monthlyRate * mathPower / (mathPower - 1));
        double interest = (monthlyPayment*lengthInMonths)-principal;


//  Display the expected monthly payment and the total interest to be paid during the term of the loan
        System.out.println("A $" + principal + " loan at "  + interestRate + "% interest for " + loanLength + " years" +
                " would have a " + String.format("$%.2f", monthlyPayment) + " monthly payment with a total interest of" +
                " " + String.format("$%.2f", interest));

    }
}