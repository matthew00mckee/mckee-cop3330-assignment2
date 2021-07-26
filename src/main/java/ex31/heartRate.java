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
        double HR;
        int age = Integer.parseInt(ageSTR);
        int resting = Integer.parseInt(restingSTR);
        System.out.println("Resting Heart Rate: "+resting+"          Age: "+age+"\n");
        System.out.println("Intensity   | Heart Rate \n-----------------------------");
        for(double i=55;i<=95;i+=5){
            HR=Math.round(idealHR(age,resting,i));
            System.out.print(i+"%          | "+HR+" bpm\n");
        }
    }
    public static double idealHR (int age, int resting,double intensity){
        double intense= intensity/100;
        double heartRate = (((220-age)-resting)*intense)+resting;
        return heartRate;
    }
}
