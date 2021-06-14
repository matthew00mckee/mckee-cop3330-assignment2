/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex29;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class badInputTest {
    @Test
    void inputTest(){
        badInput bad = new badInput();

        int test = bad.doubledYears("12");
        int expected = 6;

        assertEquals(expected,test);
    }
}