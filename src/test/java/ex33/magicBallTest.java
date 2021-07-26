/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex33;

import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class magicBallTest {


    @Test
    void testResponsesYes (){

        magicBall meb = new magicBall();

        String expected = "Yes";
        String actual = meb.randomAnswers(1);

        assertEquals(expected, actual);
    }
    @Test
    void testResponsesNo (){

        magicBall meb = new magicBall();

        String expected = "No";
        String actual = meb.randomAnswers(2);

        assertEquals(expected, actual);
    }
    @Test
    void testResponsesMaybe (){

        magicBall meb = new magicBall();

        String expected = "Maybe";
        String actual = meb.randomAnswers(3);

        assertEquals(expected, actual);
    }
    @Test
    void testResponsesLater (){

        magicBall meb = new magicBall();

        String expected = "Ask again later";
        String actual = meb.randomAnswers(4);

        assertEquals(expected, actual);
    }
}