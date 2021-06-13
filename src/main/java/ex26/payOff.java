/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex26;

import java.util.Scanner;

public class payOff {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your balance?");
        double balance = input.nextDouble();
        System.out.print("What is the card's apr?");
        double apr = input.nextDouble() /100;
        System.out.print("What is the monthly payment you can make?");
        double payment = input.nextDouble();
        int monthsLeft = calculateMonths(balance,apr,payment);

        System.out.print("It will take "+monthsLeft+" months to pay off this card.");
    }

    public static int calculateMonths(double balance, double apr, double payment){
        double dailyRate = apr/365;
        double months = (-(1/30.0)*Math.log(1+balance/payment * (1-(Math.pow(1+dailyRate,30))))
                / Math.log(1+dailyRate));
        months = Math.ceil(months);
        return (int) months;
    }

}
