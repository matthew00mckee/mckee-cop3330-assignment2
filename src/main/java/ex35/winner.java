/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class winner {
    private static final Scanner Input = new Scanner(System.in);
    static final Random randomNum = new Random();

    public static int playerTotal= 0;
    public static void main (String[] args){
        ArrayList<String> players = new ArrayList<>();
        ArrayList<String> listPlayers=listPlayers(players);
        Printoutput(randomWinner(listPlayers,randomNum.nextInt(playerTotal)));
    }
    public static ArrayList<String> listPlayers(ArrayList<String> players){
        System.out.print("Enter a player name");
        String input;
        do{
            input= Input.nextLine();
            playerTotal++;
        }while(!input.isEmpty());
        return players;
    }
    public static String randomWinner (ArrayList<String>listPlayers, int Winner){
        String winner = listPlayers.get(Winner);
        return winner;
    }
    public static void Printoutput(String Winner){
        System.out.print("Drumroll Please!\n And the winner is "+Winner);
    }
}
