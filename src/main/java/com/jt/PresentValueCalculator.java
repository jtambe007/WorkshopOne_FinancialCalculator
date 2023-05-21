package com.jt;

import java.util.Scanner;

public class PresentValueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the monthly payout, expected interest rate, and the years to pay out");
        double periodicPayout = scanner.nextFloat();
        double interestRate = scanner.nextFloat();
        double yearsToPayout = scanner.nextFloat();

        double ratePerPeriod = (interestRate/100)/12;
        double numOfPeriods = yearsToPayout * 12;

        double presentValue = periodicPayout * ((1- Math.pow((1+ratePerPeriod), - numOfPeriods))/ ratePerPeriod);
        System.out.println("To fund an annuity that pays $" + periodicPayout + " monthly for " + yearsToPayout + " " +
                "years and earns an expected " + interestRate + "% interest, you would need to invest " +
                String.format("$%.2f", presentValue) + " today.");
    }
}
