/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex34;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class removeEmployeeTest {
    @Test
    void removeConor(){
        removeEmployee re = new removeEmployee();
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Conor McGregor");
        employees.add("Nate Diaz");
        employees.add("Joe Rogan");
        employees.add("Dana White");
        employees.add("Kamaru Usman");
        ArrayList test = re.removeFiredGuy(employees,"Conor McGregor");
        employees.remove("Conor McGregor");
        ArrayList expected = employees;
        assertEquals(expected,test);
    }
    @Test
    void removeNate(){
        removeEmployee re = new removeEmployee();
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Conor McGregor");
        employees.add("Nate Diaz");
        employees.add("Joe Rogan");
        employees.add("Dana White");
        employees.add("Kamaru Usman");
        ArrayList test = re.removeFiredGuy(employees,"Nate Diaz");
        employees.remove("Nate Diaz");
        ArrayList expected = employees;
        assertEquals(expected,test);
    }
    @Test
    void removeJoe(){
        removeEmployee re = new removeEmployee();
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Conor McGregor");
        employees.add("Nate Diaz");
        employees.add("Joe Rogan");
        employees.add("Dana White");
        employees.add("Kamaru Usman");
        ArrayList test = re.removeFiredGuy(employees,"Joe Rogan");
        employees.remove("Joe Rogan");
        ArrayList expected = employees;
        assertEquals(expected,test);
    }
    @Test
    void removeDana(){
        removeEmployee re = new removeEmployee();
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Conor McGregor");
        employees.add("Nate Diaz");
        employees.add("Joe Rogan");
        employees.add("Dana White");
        employees.add("Kamaru Usman");
        ArrayList test = re.removeFiredGuy(employees,"Dana White");
        employees.remove("Dana White");
        ArrayList expected = employees;
        assertEquals(expected,test);
    }
    @Test
    void removeKamaru(){
        removeEmployee re = new removeEmployee();
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Conor McGregor");
        employees.add("Nate Diaz");
        employees.add("Joe Rogan");
        employees.add("Dana White");
        employees.add("Kamaru Usman");
        ArrayList test = re.removeFiredGuy(employees,"Kamaru Usman");
        employees.remove("Kamaru Usman");
        ArrayList expected = employees;
        assertEquals(expected,test);
    }
}