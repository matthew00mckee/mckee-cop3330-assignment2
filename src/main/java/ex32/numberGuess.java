/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex32;

import java.util.Scanner;

public class numberGuess {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Let's play a guessing game\n");
        playGame(difficultyLevel());
    }
    public static int difficultyLevel(){
        System.out.print("Enter the difficulty level (1, 2, or 3)\n");
        int difficulty = input.nextInt();
        switch (difficulty){
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                System.out.print("input error, try again.");
                return -1;
        }
    }
    public static void playGame (int level){
        switch (level) {
            case 1 -> easyPeasy();
            case 2 -> medium();
            case 3 -> goodLuck();
            default -> difficultyLevel();
        }
    }
    public static void easyPeasy(){
        System.out.print("Difficulty Easy: guess a number between 1 and 10\n");
        int easyNum = (int) Math.ceil(Math.random()*10);
        int guessCount = 1;
        boolean winner = false;
        do {
            System.out.print("Enter guess number "+guessCount+"\n");
            int guess = input.nextInt();
            if (guess==easyNum){
                winner = true;
                System.out.print("Congrats guess number "+guessCount+" was correct!\n");
                playAgain();
            }else if (easyNum>guess){
                System.out.print("Too low. Try again\n");
            }else if (easyNum < guess){
                System.out.print("Too high. Try again\n");
            }
            guessCount++;
        }while (!winner);
    }
    public static void medium(){
        System.out.print("Difficulty Easy: guess a number between 1 and 100\n");
        int medNum = (int) Math.ceil(Math.random()*100);
        int guessCount = 1;
        boolean winner = false;
        do {
            System.out.print("Enter guess number "+guessCount+"\n");
            int guess = input.nextInt();
            if (guess==medNum){
                winner = true;
                System.out.print("Congrats guess number "+guessCount+" was correct!\n");
                playAgain();
            }else if (medNum>guess){
                System.out.print("Too low. Try again\n");
            }else if (medNum < guess){
                System.out.print("Too high. Try again\n");
            }
            guessCount++;
        }while (!winner);
    }
    public static void goodLuck(){
        System.out.print("Difficulty hard: guess a number between 1 and 1000\n");
        int hardNum = (int) Math.ceil(Math.random()*1000);
        int guessCount = 1;
        boolean winner = false;
        do {
            System.out.print("Enter guess number "+guessCount+"\n");
            int guess = input.nextInt();
            if (guess==hardNum){
                winner = true;
                System.out.print("Congrats guess number "+guessCount+" was correct!\n");
                playAgain();
            }else if (hardNum>guess){
                System.out.print("Too low. Try again\n");
            }else if (hardNum < guess){
                System.out.print("Too high. Try again\n");
            }
            guessCount++;
        }while (!winner);
    }
    public static void playAgain(){
        System.out.print("Would you like to play again? (y/n)\n");
        String again = input.next();
        if (again.equals("y")||again.equals("Y")){
            playGame(difficultyLevel());
        }else if (again.equals("n")||again.equals("N")){
            System.out.print("Thanks for playing, come back anytime\n");
            System.exit(0);
        }else{
            System.out.print("Input invalid\n");
            playAgain();
        }
    }
}
