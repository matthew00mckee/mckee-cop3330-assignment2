/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex37;

import java.util.Random;
import java.util.Scanner;

public class newPassword {
    private static final Scanner input = new Scanner(System.in);
    private static final Random random = new Random();
    //declaring class variables that will be used to generate a new password
    public static int minCharacters;
    public static int specialCount;
    public static int numberDigits;

    //lists for usable characters
    static char[] specialChars = {'!','@','#','$','%','&','*'};
    static char[] numbers ={'0','1','2','3','4','5','6','7','8','9'};
    static char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k',
            'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static void main (String[] args){
        getParameters();
        String Password_new = passwordGenerator(minCharacters,specialCount,numberDigits);
        System.out.print("Your new password is: "+Password_new);
    }
    public static void getParameters (){
        System.out.print("What is the minimum number of characters needed?");
        minCharacters=input.nextInt();
        System.out.print("How many special characters are needed?");
        specialCount=input.nextInt();
        System.out.print("How many numbers do you need in the password?");
        numberDigits=input.nextInt();
    }
    public static String passwordGenerator(int minCharacters,int specialCount,int numberDigits){
        String passwordNew= "";
        int numLetters = (minCharacters-(specialCount+numberDigits));

        for (int i = 0; i < numLetters; i++) {
            passwordNew += randomLetter();
        }
        for (int i = 0; i < minCharacters-(numLetters+specialCount); i++) {
            passwordNew += randomNumber();
        }
        for (int j = 0; j < minCharacters-(numLetters+numberDigits); j++) {
            passwordNew += randomSpecial();
        }
        return passwordNew;
    }
    public static char randomLetter(){
        int letter = alphabet.length;
        return alphabet[random.nextInt(letter)];
    }
    public static char randomNumber(){
        int number = numbers.length;
        return numbers[random.nextInt(number)];
    }
    public static char randomSpecial(){
        int special = specialChars.length;
        return specialChars[random.nextInt(special)];
    }

}
