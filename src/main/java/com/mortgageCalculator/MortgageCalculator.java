package com.mortgageCalculator;

import java.util.Scanner;

public class MortgageCalculator {

//  This program is a mortgage calculator that calculates how much a monthly payment and interest for a loan would be

    public static void main(String[] args) {

        // Collects user's name
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = myScanner.nextLine();
        System.out.println("Welcome " + name + ", answer the following prompts to calculate your mortgage");

        // Collects Loan Amount
        Scanner myScannerTwo = new Scanner(System.in);
        System.out.print("Enter your Principle amount: ");
        Float loanAmount = myScanner.nextFloat();

        // Collects Interest Rate in percent
        Scanner myScannerThree = new Scanner(System.in);
        System.out.print("Enter your Interest rate in percent: ");
        Float interestRes = myScanner.nextFloat();

        // Collects Length of the loan in Years
        Scanner myScannerFour = new Scanner(System.in);
        System.out.print("Enter your loan length in years: ");
        Integer loanLength = myScanner.nextInt();

        // Converts interest rate to a monthly rate in decimal form
        float interestRate = interestRes /100/12;

        // Converts loan length to months
        int loanLengthInMonths = loanLength * 12;

        // Defines formula for calculating mortgage payments
        double mathPower = Math.pow(1 + interestRate, loanLengthInMonths);
        double monthlyPayment = loanAmount * (interestRate * mathPower / (mathPower - 1));

        System.out.println("Monthly due is: " + String.format("$%.2f",  monthlyPayment) + " and the total interest rate is " + String.format("$%.2f",(monthlyPayment*loanLengthInMonths)-loanAmount));

    }
}
