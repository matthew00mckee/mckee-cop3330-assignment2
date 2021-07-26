package ex37;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class newPasswordTest {
    @Test
    void Check_Num_Chars(){
        newPassword pass = new newPassword();
        String password = pass.passwordGenerator(8,2,1);
        int test = password.length();
        int expected = 8;

        assertEquals(expected,test);
    }
}