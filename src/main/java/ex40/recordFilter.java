/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

/*package ex40;

import ex39.employeeSort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class recordFilter {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[]args){
        recordFilter filter = new recordFilter();
        HashMap<String, employeeSort> byLastName = recordFilter.getByLastName();
        ArrayList<String> lastNames = recordFilter.getLastNames();
        String positionSearch = recordFilter.inputReader("Enter a position to filter by");
        ArrayList<String> results = recordFilter.filterWorkers(byLastName, lastNames, positionSearch);
        String output = recordFilter.outputString(results,byLastName);
        recordFilter.printOutput(output);
    }
    private static ArrayList<String> getLastNames(){
        ArrayList<String> last_Name = new ArrayList<String>();
        last_Name.add("Johnson");
        last_Name.add("Xiong");
        last_Name.add("Michaelson");
        last_Name.add("Jacobson");
        last_Name.add("Jackson");
        last_Name.add("Webber");

        return last_Name;
    }
    private static HashMap<String,employeeSort> getByLastName(){
        HashMap<String,employeeSort> lastNameSorted = new HashMap<String,employeeSort>();
        lastNameSorted.put("Johnson",new employeeSort("John", "Johnson",
                "Manager","2016-12-31"));
        lastNameSorted.put("Xiong",new employeeSort("Tou","Xiong",
                        "Software Engineer","2016-10-05"));
        lastNameSorted.put("Michaelson",new employeeSort("Michaela","Michaelson",
                        "District Manager",	"2015-12-19"));
        lastNameSorted.put("Jacobson",new employeeSort("Jake","Jacobson",
                        "Programmer",""));
        lastNameSorted.put("Jackson",new employeeSort("Jacquelyn","Jackson",
                        "DBA",""));
        lastNameSorted.put("Webber",new employeeSort("Sally","Webber",
                "Web Developer","2015-12-18"));

        return lastNameSorted;
    }
    private static String inputReader(String readSTR){
        System.out.print(readSTR);
        String in = input.nextLine();
        return in;
    }
    private static ArrayList<String> filterWorkers (HashMap<String,employeeSort> byLastName,
                                                    ArrayList<String> lastNames,String positionSearch){

        ArrayList<String> outputString = new ArrayList<String>();
        for (int i=0;i<lastNames.size();i++) {
            employeeSort worker = byLastName.get(lastNames.get(i));
        }
        return outputString;
    }


    private static void printOutput(String output){
        System.out.print(output);
    }

}
*/