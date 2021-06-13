/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex26;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class payOffTest {
    @Test
    void calculateMonthsTest(){
        payOff mc = new payOff();

        int test = mc.calculateMonths(5000,.12,100);
        int expected = 70;

        assertEquals(expected, test);
    }
}