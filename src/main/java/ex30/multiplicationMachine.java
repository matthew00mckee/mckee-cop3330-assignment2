/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex30;

import java.util.Scanner;

public class multiplicationMachine {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        String table = multiplyMachine();
        System.out.print(table);
    }
    public static String multiplyMachine(){
        StringBuilder outputString = null;
        int MAX = 12;
        for (int i = 1; i <= MAX; i++){
            for (int j = 1; j <= MAX; j++) {
                String num = Integer.toString(i * j);

                if (outputString == null) {
                    outputString = new StringBuilder(String.format("%5s", num));
                }
                else {
                    outputString.append(String.format("%5s", num));
                }
            }

            outputString.append("\n");
        }

        assert outputString != null;
        return outputString.toString();
    }
}
