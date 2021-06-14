/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex29;

import java.util.Scanner;

public class badInput {
    public static void main (String [] args){
        String output = String.format("It will take %d years to double your investment", doubledYears(inputRate()));
        System.out.print(output);
    }
    public static String inputRate(){
        Scanner input = new Scanner(System.in);
        String Rate;
        do {
            System.out.print("What is the return rate?");
            Rate = input.nextLine();
        }while (!Character.isDigit(Rate.charAt(0))||Rate.equals("0"));
        return Rate;
    }
    public static int doubledYears(String Rate){
        return 72/Integer.parseInt(Rate);
    }
}
