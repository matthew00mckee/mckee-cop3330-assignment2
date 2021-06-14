/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew McKee
 */

package ex33;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class magicBallTest {

    @Test
    void testResponses (){
        magicBall mb= new magicBall();

        Object test = mb.magic8Ball("Yes");
        Object expected = Arrays.asList("Yes");

        assertEquals(expected,test);
    }
}