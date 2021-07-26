package ex38;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

class numberFilterTest {
    @Test
    void test_Filter(){
        numberFilter filter = new numberFilter();

        String num = "1 2 3 4 5 6";

        char[] numbers = num.toCharArray();

        List<Character> test = filter.FilterNumbers(numbers);
        String Test = test.toString();
        String expected = "[2, 4, 6]";

        assertEquals(expected,Test);
    }
}