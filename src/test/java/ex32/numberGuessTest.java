/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex32;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class numberGuessTest {

    @Test
    void test_Output (){
        Game tg = new Game();

        String expected = "You got it in 4 guesses!\n\n";
        String actual =tg.output(4);

        assertEquals(expected, actual);
    }
}