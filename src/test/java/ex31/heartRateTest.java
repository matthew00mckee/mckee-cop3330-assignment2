package ex31;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class heartRateTest {

    @Test
    void testHeartRate(){
        heartRate hr = new heartRate();

        double test = Math.round(hr.idealHR(22,65,55));
        double expected = 138.0;

        assertEquals(expected,test);
    }
}