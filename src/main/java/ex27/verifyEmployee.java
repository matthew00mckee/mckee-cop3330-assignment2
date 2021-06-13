/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex27;

import java.util.Scanner;

public class verifyEmployee {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first name:");
        String First_Name = input.nextLine();
        System.out.print("Enter the last name:");
        String Last_Name = input.nextLine();
        System.out.print("Enter the employee zip code:");
        String Zip_Code = input.nextLine();
        System.out.print("Enter the employee ID:");
        String emplID = input.nextLine();

        ValidateEmployeeInput(First_Name,Last_Name,Zip_Code,emplID);
    }
    public static boolean ValidateEmployeeInput (String firstName,String lastName,
                                                 String Zip, String emplID){
        boolean FirstName = ValidateFirstName(firstName);
        boolean LastName = ValidateLastName(lastName);
        boolean ZipCode = ValidateZipCode(Zip);
        boolean EmployeeID = ValidateEmployeeID(emplID);
        if (FirstName&&LastName&&ZipCode&&EmployeeID){
            System.out.print("Employee Verified.");
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean ValidateFirstName(String firstName){
        if (firstName.length()==0){
            System.out.print("Please input a first name.\n");
            return false;
        }else if (firstName.length()<=2){
            System.out.print("\""+firstName+"\" is too short and not a valid name.\n");
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean ValidateLastName (String lastName){
        if (lastName.length()==0){
            System.out.print("Please input a last name.\n");
            return false;
        }else if (lastName.length()<=2){
            System.out.print("\""+lastName+"\" is too shot and not a valid last name.\n");
            return false;
        }else{
            return true;
        }
    }
    public static boolean ValidateZipCode (String zipCode){
        if (zipCode.length()==0){
            System.out.print("Please input a zip code.\n");
            return false;
        }
        int i = 0;
        while ( i<zipCode.length()){
            if(Character.isDigit(zipCode.charAt(i))){
                i++;
            }
            else {
                System.out.print("Zipcode must be a number.\n");
                return false;
            }
        }
        return true;
    }
    public static boolean ValidateEmployeeID (String emplid){
        if (emplid.length()==0){
            System.out.print("Please input an employee ID. \n");
            return false;
        }else if (emplid.length()<6){
            System.out.print("\""+emplid+"\" is too short and not a valid ID");
            return false;
        }
        if (Character.isAlphabetic(emplid.charAt(0))){
            if (Character.isAlphabetic(emplid.charAt(1))){
                if (emplid.charAt(2)=='-'){
                    if (Character.isDigit(emplid.charAt(3))){
                        if (Character.isDigit(emplid.charAt(4))){
                            if (Character.isDigit(emplid.charAt(5))){
                                if (Character.isDigit(emplid.charAt(6))){
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.print("\""+emplid+"\" is not a valid ID form\n");
        return false;
    }

}
