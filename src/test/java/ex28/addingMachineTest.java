/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex28;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class addingMachineTest {
    @Test
    void machineTest (){
        addingMachine am = new addingMachine();
        String test = am.printOutput(25);
        String expected = "The total is: 25";
        assertEquals(expected,test);
    }
}