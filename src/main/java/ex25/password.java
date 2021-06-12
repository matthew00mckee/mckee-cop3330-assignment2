/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex25;

import java.util.Scanner;

public class password {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int StrengthIndicator;
        do {
            System.out.print("Enter a Password");
            String password = input.nextLine();
            StrengthIndicator = strength(password);
            PrintStrength(StrengthIndicator, password);
        } while (StrengthIndicator != 4);
    }
    public static int strength(String password){
       boolean length = false, letters = false, specialChar = false, num = false;
       if (password.length()>=8){
           length = true;
       }
       for( char a : password.toCharArray()){
           if (Character.isAlphabetic(a)){
               letters = true;
           }
           else if (Character.isDigit(a)){
               num = true;
           }
           else {
               specialChar = true;
           }
       }
        if (!letters&&!length&&!specialChar&&num){
            return 1;
        }
        else if (!length&&!num&&!specialChar&&letters){
           return 2;
        }
        else if (!specialChar&&letters&&length&&num){
            return 3;
        }
        else if (length&&letters&&specialChar&&num){
            return 4;
        }
        else {
            return 0;
        }
    }

    public static void PrintStrength ( int StrengthIndicator, String password){
        switch (StrengthIndicator)
        {
            case 1 :
                System.out.print("The password \""+password+ "\" is a very weak password\n");
                break;
            case 2 :
                System.out.print("The password \""+password+ "\" is a weak password\n");
                break;
            case 3 :
                System.out.print("The password \""+password+ "\" is a strong password\n");
                break;
            case 4 :
                System.out.print("The password \""+password+ "\" is a very strong password\n");
                break;
            default:
                System.out.print("That is too weak to be quantified\n");
                break;
        }
    }
}
