/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex31;
import java.util.Scanner;

public class heartRate {
    private static final Scanner input = new Scanner(System.in);
    public static void main (String[] args){
        calculateHeartRate(inputUserAge(),inputUserHR());
    }
    public static String inputUserAge(){
        String age;
        do{
            System.out.print("What is your age?");
            age = input.nextLine();
        }while(!Character.isDigit(age.charAt(0))||age.equals("0"));
        return age;
    }
    public static String inputUserHR(){
        String restingHR;
        do{
            System.out.print("What is your resting heart rate?");
            restingHR = input.nextLine();
        }while (!Character.isDigit(restingHR.charAt(0))||restingHR.equals("0"));
        return restingHR;
    }
    public static void calculateHeartRate(String ageSTR, String restingSTR){
        int idealHR = 0;
        int age = Integer.parseInt(ageSTR);
        int resting = Integer.parseInt(restingSTR);
        System.out.println("Resting Heart Rate: "+resting+"          Age: "+age+"\n");
        System.out.println("Intensity   | Heart Rate \n-----------------------------");
        for(int i=55;i<=95;i+=5){
            idealHR=idealHR(age,resting,i);
            System.out.println(String.format("%d          | %d bpm",i,idealHR));
        }
    }
    public static int idealHR (int age, int resting,int intensity){
        int heartRate = (((220-age)-resting)*intensity)+resting;
        return heartRate;
    }
}
