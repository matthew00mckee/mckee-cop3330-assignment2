/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex33;

import java.util.Random;

public class magicBall {
    Random randomNumbers = new Random();

    public String eightBall() {
        magicBall magicEightBall = new magicBall();

        return magicEightBall.randomAnswers(magicEightBall.randChoice());
    }

    public int randChoice() {
        return (1 + randomNumbers.nextInt(4));
    }

    public String randomAnswers(int response) {
        return switch (response) {
            case 1 -> "Yes";
            case 2 -> "No";
            case 3 -> "Maybe";
            case 4 -> "Ask again later";
            default -> null;
        };
    }
}
