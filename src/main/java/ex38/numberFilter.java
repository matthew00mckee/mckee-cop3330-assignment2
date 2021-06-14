/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex38;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class numberFilter {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args){

        System.out.print("Enter a list of numbers, with spaces in between inputs");
        String numberLine = input.nextLine();

        PrintFilteredNums(FilterNumbers(createArray(numberLine)));
    }
    public static char[] createArray(String Numbers){
        return Numbers.toCharArray();
    }
    public static List<Character> FilterNumbers(char[] NumbersArray){
        List<Character> filteredNums = new ArrayList<>();
        for(int i=0;i<NumbersArray.length;i++){
            if (Character.getNumericValue(NumbersArray[i])%2==0){
                filteredNums.add(NumbersArray[i]);
            }
        }
        return filteredNums;
    }
    public static void PrintFilteredNums (List<Character> filteredNums){
        System.out.print("The even numbers are: ");
        for (int i=0;i<filteredNums.size();i++){
            System.out.printf("%c ",filteredNums.get(i));
        }
    }
}
