package ex31;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class heartRateTest {

    @Test
    void testHeartRate(){
        heartRate hr = new heartRate();

        int test = hr.idealHR(22,65,55);
        int expected = 138;

        assertEquals(expected,test);
    }
}