/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex30;

import java.util.Scanner;

public class multiplicationMachine {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the width of the multiplication table");
        int width = input.nextInt();
        multiplyMachine(width,width);
    }
    public static void multiplyMachine(int length, int width ){
        for (int j =1;j<=length;j++){
            for(int i=1;i<=width;i++){
                System.out.print(String.format("%5d",(i*j)));
            }
            System.out.println();
        }
    }
}
