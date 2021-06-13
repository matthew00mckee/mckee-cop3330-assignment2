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
        int monthsLeft = PaymentCalculator.calculateMonths(balance,apr,payment);

        System.out.print("It will take "+monthsLeft+" months to pay off this card.");
    }

}
