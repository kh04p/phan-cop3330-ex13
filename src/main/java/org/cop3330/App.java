/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        double principal = input.nextDouble();
        System.out.print("What is the interest rate? ");
        double rate = input.nextDouble();
        System.out.print("What is the number of years? ");
        int years = input.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        int compound = input.nextInt();
        System.out.printf("$%.2f invested at %.2f for %d years compounded %d times a year is $%.2f.",
                principal, rate, years, compound, interest.calculate(principal, rate, years, compound));
    }
}
