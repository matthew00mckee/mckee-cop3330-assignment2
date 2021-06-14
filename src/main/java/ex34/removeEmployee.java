/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class removeEmployee {
    private static final Scanner input = new Scanner(System.in);
    public static void main (String[] args){
        removeEmployee employeeRecord = new removeEmployee();
        ArrayList<String> listEmployee = new ArrayList<>();
        employeeRecord.inputEmployees(listEmployee);
        employeeRecord.printEmployees(listEmployee);
        String firedGuy = employeeRecord.getName();
        employeeRecord.removeFiredGuy(listEmployee, firedGuy);
        employeeRecord.printEmployees(listEmployee);
    }
    public void printEmployees(ArrayList<String> listEmployee){
        System.out.printf("There are %d employees:\n", listEmployee.size());
        for (int i =0; i<listEmployee.size();i++){
            System.out.print(listEmployee.get(i)+"\n");
        }
    }
    public String getName(){
        System.out.print("Enter the name of the employee you wish to have removed: ");
        return input.nextLine();
    }
    public ArrayList removeFiredGuy (ArrayList<String> listEmployee, String firedGuy){
        for (int i=0; i<listEmployee.size();i++){
            if(firedGuy.equals(listEmployee.get(i))){
                listEmployee.remove(i);
            }
        }
        return null;
    }
    public void inputEmployees(ArrayList<String> employees){
        employees.add("Conor McGregor");
        employees.add("Nate Diaz");
        employees.add("Joe Rogan");
        employees.add("Dana White");
        employees.add("Kamaru Usman");
    }
}