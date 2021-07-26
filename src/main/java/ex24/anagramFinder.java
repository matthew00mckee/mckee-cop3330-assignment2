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
        anagramTest test = new anagramTest();
        System.out.print("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("\nEnter the first string:");
        String wordOne = input.nextLine();
        System.out.print("Enter the second string:");
        String wordTwo = input.nextLine();

        boolean lengthSame =test.lengthTest(wordOne,wordTwo);
        boolean isAnagram = test.testForAnagrams(wordOne,wordTwo);
        //if anagramtest is true, print out they are anagrams else print they are not

        if (lengthSame&&isAnagram){
            System.out.print("\""+wordOne+"\" and \""+wordTwo+"\" are anagrams");
        }
        else{
            System.out.print("\""+wordOne+"\" and \""+wordTwo+"\" are not anagrams");
        }
    }
}
