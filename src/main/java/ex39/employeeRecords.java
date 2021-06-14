/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex39;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class employeeRecords {
    public static void main (String[]args){
        employeeSort[] employees = {
            new employeeSort("John", "Johnson","Manager","2016-12-31"),
            new employeeSort("Tou","Xiong","Software Engineer","2016-10-05"),
            new employeeSort("Michaela","Michaelson","District Manager",	"2015-12-19"),
            new employeeSort("Jake","Jacobson","Programmer",""),
            new employeeSort("Jacquelyn","Jackson","DBA",""),
            new employeeSort("Sally","Webber","Web Developer","2015-12-18")
        };

        List<employeeSort> out = Arrays.asList(employees);
        System.out.print("The employees listed:");
        out.stream().forEach(System.out::println);

        Function<employeeSort,String> byLastName = employeeSort::getLastName;

        Comparator<employeeSort> lastOrder = Comparator.comparing(byLastName);

        System.out.print("The sorted employee list is: \n");
        System.out.print("First Name  | Last Name   | Position      | Separation Date\n");

        out.stream().sorted(lastOrder).forEach(System.out::println);

    }
}

