/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex33;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class magicBall {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[]args){
        List<String> responses = Arrays.asList("Yes", "No","Maybe", "Ask again later");
        System.out.print("What would you like to ask the Magic 8 Ball?");
        String userQuest = input.next();
        System.out.print(magic8Ball(responses));
    }
    public static Object magic8Ball(List<String> responses){
        int randomOutcome = (int) Math.ceil(Math.random()*4);
        return switch (randomOutcome){
            case 1-> responses.get(0);
            case 2-> responses.get(1);
            case 3-> responses.get(2);
            default-> responses.get(3);
        };
    }
}
