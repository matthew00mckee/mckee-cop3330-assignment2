package ex35;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class winnerTest {
    @Test
    void Test_Winner(){
        winner w = new winner();
        ArrayList<String> list = new ArrayList<>();
        list.add("Matthew");
        list.add("Blair");
        list.add("Sarah");
        list.add("Erin");

        String expected = "Matthew";
        String test = w.randomWinner(list,0);

        assertEquals(expected,test);
    }
    @Test
    void Test_Winner2(){
        winner w = new winner();
        ArrayList<String> list = new ArrayList<>();
        list.add("Matthew");
        list.add("Blair");
        list.add("Sarah");
        list.add("Erin");

        String expected = "Blair";
        String test = w.randomWinner(list,1);

        assertEquals(expected,test);
    }
    @Test
    void Test_Winner3(){
        winner w = new winner();
        ArrayList<String> list = new ArrayList<>();
        list.add("Matthew");
        list.add("Blair");
        list.add("Sarah");
        list.add("Erin");

        String expected = "Sarah";
        String test = w.randomWinner(list,2);

        assertEquals(expected,test);
    }
    @Test
    void Test_Winner4(){
        winner w = new winner();
        ArrayList<String> list = new ArrayList<>();
        list.add("Matthew");
        list.add("Blair");
        list.add("Sarah");
        list.add("Erin");

        String expected = "Erin";
        String test = w.randomWinner(list,3);

        assertEquals(expected,test);
    }
}