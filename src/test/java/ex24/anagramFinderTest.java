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
        anagramFinder check = new anagramFinder();

        boolean test = check.anagramtest("tone","note");
        boolean expected = true;
        assertEquals(test,expected);
    }
    @Test
    void anagramtest_is_False(){
        anagramFinder check = new anagramFinder();

        boolean test = check.anagramtest("car", "racecar");
        boolean expected = false;
        assertEquals(test,expected);
    }
}