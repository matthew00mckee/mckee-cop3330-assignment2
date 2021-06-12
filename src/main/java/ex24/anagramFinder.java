/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex24;
import java.util.Arrays;
import java.util.Scanner;

public class anagramFinder {
    public static void main(String[] args){
        //user input for the two strings
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("\nEnter the first string:");
        String wordOne = input.nextLine();
        System.out.print("Enter the second string:");
        String wordTwo = input.nextLine();

        //if anagramtest is true, print out they are anagrams else print they are not
        if (anagramtest(wordOne, wordTwo)){
            System.out.print("\""+wordOne+"\" and \""+wordTwo+"\" are anagrams");
        }
        else{
            System.out.print("\""+wordOne+"\" and \""+wordTwo+"\" are not anagrams");
        }
    }
    public static boolean anagramtest(String wordOne, String wordTwo){
        if(wordOne.length() != wordTwo.length()){
            return false;
        }
        else {
            //changes the strings to arrays to be compared
            char [] arrayOne = wordOne.toLowerCase().toCharArray();
            char [] arrayTwo = wordTwo.toLowerCase().toCharArray();

            //this sorts the two arrays alphabetically
            Arrays.sort(arrayOne);
            Arrays.sort(arrayTwo);

            //this checks to see if it is the same array
            return Arrays.equals(arrayOne,arrayTwo);
        }


    }
}
