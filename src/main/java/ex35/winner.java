/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex35;

import java.util.Random;
import java.util.Scanner;

public class winner {
    private static final Scanner input = new Scanner(System.in);
    static final Random randomNum = new Random();
    public static String[] players = new String[100];
    public static int playerTotal= 0;
    public static void main (String[] args){
        listPlayers();
        randomWinner();
    }
    public static void listPlayers(){
        String comp;
        for (int i=0; ;i++){
            System.out.print("Enter a player name");
            comp = input.nextLine();
            if(comp.isEmpty()){
                return;
            }else {
                players[i]=comp;
                playerTotal++;
            }
        }
    }
    public static void randomWinner (){
        System.out.printf("Drumroll please\nThe winner is ... %s",
                players[randomNum.nextInt(playerTotal)]);
    }
}
