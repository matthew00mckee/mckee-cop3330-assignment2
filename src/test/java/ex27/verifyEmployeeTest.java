/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex27;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class verifyEmployeeTest {
    @Test
    void firstNameEmpty() {
        verifyEmployee fn = new verifyEmployee();
        boolean test = fn.ValidateFirstName("");
        assertEquals(false,test);
    }
    @Test
    void firstNameFalse(){
        verifyEmployee fn = new verifyEmployee();
        boolean test = fn.ValidateFirstName("t");
        assertEquals(false,test);
    }
    @Test
    void firstNameTrue(){
        verifyEmployee fn = new verifyEmployee();
        boolean test = fn.ValidateFirstName("Matthew");
        assertEquals(true,test);
    }
    @Test
    void lastNameEmpty (){
        verifyEmployee ln = new verifyEmployee();
        boolean test = ln.ValidateFirstName("");
        assertEquals(false,test);
    }
    @Test
    void  lastNameFalse(){
        verifyEmployee ln = new verifyEmployee();
        boolean test = ln.ValidateFirstName("m");
        assertEquals(false,test);
    }
    @Test
    void lastNameTrue(){
        verifyEmployee ln = new verifyEmployee();
        boolean test = ln.ValidateFirstName("McKee");
        assertEquals(true,test);
    }
    @Test
    void ZipEmpty(){
        verifyEmployee zip = new verifyEmployee();
        boolean test = zip.ValidateZipCode("");
        assertEquals(false,test);
    }
    @Test
    void ZipFalse(){
        verifyEmployee zip = new verifyEmployee();
        boolean test = zip.ValidateZipCode("abcde");
        assertEquals(false,test);
    }
    @Test
    void ZipTrue (){
        verifyEmployee zip = new verifyEmployee();
        boolean test = zip.ValidateZipCode("32816");
        assertEquals(true,test);
    }
    @Test
    void emplidEmpty(){
        verifyEmployee emplid = new verifyEmployee();
        boolean test = emplid.ValidateEmployeeID("");
        assertEquals(false,test);
    }
    @Test
    void emplidFalse(){
        verifyEmployee emplid = new verifyEmployee();
        boolean test = emplid.ValidateEmployeeID("a12-1234");
        assertEquals(false,test);
    }
    @Test
    void emplidTrue(){
        verifyEmployee emplid = new verifyEmployee();
        boolean test = emplid.ValidateEmployeeID("aa-1234");
        assertEquals(true,test);
    }
}