/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex25;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class passwordTest {

    @Test
    void return_very_weak(){
        password Test = new password();

        int testPassword = Test.strength("1234");
        int expected = 1;

        assertEquals(testPassword,expected);
    }
    @Test
    void return_weak(){
        password Test = new password();

        int testPassword = Test.strength("acdc");
        int expected = 2;

        assertEquals(testPassword,expected);
    }
    @Test
    void return_strong(){
        password Test = new password();

        int testPassword = Test.strength("a1b2c3d45");
        int expected = 3;

        assertEquals(testPassword,expected);
    }
    @Test
    void return_very_strong(){
        password Test = new password();

        int testPassword = Test.strength("1337h@xor!");
        int expected = 4;

        assertEquals(testPassword,expected);
    }
}