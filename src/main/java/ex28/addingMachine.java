/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex28;

import java.util.Scanner;

public class addingMachine {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[]args){
        System.out.print("Please enter 5 numbers when prompted.\n");
        printOutput(UserInput());
    }
    public static int UserInput(){
        int num;
        int sum =0;
        int i=0;
        while (i<5){
            System.out.print("Enter number "+(i+1)+" :");
            num=input.nextInt();
            sum=sum+num;
            i++;
        }
        return sum;
    }
    public static String printOutput(int total){
        String output = "The total is: "+ total;
        System.out.print(output);
        return output;
    }
}
