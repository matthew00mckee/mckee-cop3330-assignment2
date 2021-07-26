/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex32;

public class numberGuess {
    public static void main(String[] args) {
        numberGuess myGuess = new numberGuess();
        Game playGame = new Game();

        System.out.print("Let's play Guess the Number!\n\n");

        String playAgain = "y";
        while (playAgain.equals("y")) {

            String output = playGame.game();
            myGuess.print(output);

            playAgain = playGame.playAgain();
        }
    }

    public void print(String output) {
        System.out.print(output);
    }


}
