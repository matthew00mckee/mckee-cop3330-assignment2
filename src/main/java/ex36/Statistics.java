/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex36;

import java.util.Scanner;


public class Statistics {
    public static int[] rawData = new int[1000];
    private static final Scanner input = new Scanner(System.in);
    public static int numberCount =0;
    public static void main (String[] args){
        enterNumbers();
        printArray();
        printResults(max(rawData,numberCount),min(rawData,numberCount),
                Average(rawData,numberCount),std(rawData,numberCount));
    }
    public static void enterNumbers(){
        String comp;
        for (int i = 0; ;i++){
            System.out.printf("Enter a number: \n");
            comp = input.nextLine();
           try {
               rawData[i]=Integer.parseInt(comp);
               numberCount++;
           }catch (Exception done){
               if (comp.equals("done")||comp.equals("DONE")){
                   return;
               }else{
                   System.out.printf("invalid input\n");
               }
           }
        }
    }
    public static void printArray(){
        System.out.print("The data given is:");
        for (int i=0;i<=numberCount-1;i++){
            System.out.printf(" %d,",rawData[i]);
        }
        System.out.printf("\n");
    }
    public static void printResults (int maximum, int minimum, double Average, double StandardDEV ){
        System.out.printf("The average is %.1f\n", Average);
        System.out.printf("The minimum is %d\n", minimum);
        System.out.printf("The maximum is %d\n",maximum);
        System.out.printf("The standard deviation is %.2f\n",StandardDEV);
    }
    public static int max (int[]rawData,int numberCount){
        int max = rawData[0];
        for (int i=0;i<=numberCount-1;i++){
            if(rawData[i]>max){
                max = rawData[i];
            }
        }
        return max;
    }
    public static int min (int[]rawData,int numberCount){
        int minimun = rawData[0];
        for (int i=0;i<=numberCount-1;i++){
            if(rawData[i]<minimun){
                minimun = rawData[i];
            }
        }
        return minimun;
    }
    public static double Average (int[]rawData,int numberCount){
        double total = 0;
        for (int i=0;i<=numberCount-1;i++){
            total+= rawData[i];
        }
        return (total/numberCount);
    }
    public static double std(int[]rawData,int numberCount){
        double deviation =0;
        double sum =0;
        for (int i=0;i<=numberCount-1;i++){
            sum+= rawData[i];
        }
        double average = sum /numberCount;
        for (int i=0;i<=numberCount-1;i++){
            deviation+= Math.pow(rawData[i]-average,2);
        }
        return Math.sqrt(deviation/numberCount);
    }
}
