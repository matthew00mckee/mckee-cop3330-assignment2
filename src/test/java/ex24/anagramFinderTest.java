/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex24;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class anagramFinderTest {

    @Test
    void anagramtest_is_True(){
        anagramTest check = new anagramTest();

        boolean test = check.testForAnagrams("tone","note");
        boolean expected = true;
        assertEquals(test,expected);
    }
    @Test
    void anagramtest_Wrong_Length_F(){
        anagramTest check = new anagramTest();

        boolean test = check.lengthTest("car", "racecar");
        boolean expected = false;
        assertEquals(test,expected);
    }
    @Test
    void anagramTest_False(){
        anagramTest check = new anagramTest();

        boolean test = check.testForAnagrams("wood", "door");
        boolean expected = false;
        assertEquals(test,expected);
    }
}