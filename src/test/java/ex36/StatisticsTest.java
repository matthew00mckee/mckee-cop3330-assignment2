package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {
    @Test
    void test_Max(){
        Statistics stats = new Statistics();
        int[] newData = new int [5];
        newData[0]=1;
        newData[1]=1;
        newData[2]=4;
        newData[3]=2;
        newData[4]=5;

        int expected = 5;
        int test = stats.max(newData,5);
        assertEquals(expected,test);
    }
    @Test
    void test_Min(){
        Statistics stats = new Statistics();
        int[] newData = new int [5];
        newData[0]=1;
        newData[1]=1;
        newData[2]=4;
        newData[3]=2;
        newData[4]=5;

        int expected = 1;
        int test = stats.min(newData,5);

        assertEquals(expected,test);
    }
    @Test
    void test_Average(){
        Statistics stats = new Statistics();
        int[] newData = new int [5];
        newData[0]=3;
        newData[1]=1;
        newData[2]=4;
        newData[3]=2;
        newData[4]=5;

        double expected = 3.0;
        double test = stats.Average(newData,5);

        assertEquals(expected,test);
    }
    @Test
    void test_STD(){
        Statistics stats = new Statistics();
        int[] newData = new int [5];
        newData[0]=3;
        newData[1]=1;
        newData[2]=4;
        newData[3]=2;
        newData[4]=5;

        double expected = 1.4142135623730951;
        double test = stats.std(newData,5);

        assertEquals(expected,test);
    }
}