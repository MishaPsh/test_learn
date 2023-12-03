package myxap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestThrowsTest {

    @Test
    void testExpectedException() {
        NumberFormatException exception = Assertions.assertThrows(NumberFormatException.class,
                () -> Integer.parseInt("One"), "NumberFormatException was expected");

        Assertions.assertEquals("For input string: \"One\"", exception.getMessage());
    }

    @Test
    void testNamberFalse(){
        TestThrows testThrows = new TestThrows();
        Assertions.assertThrows(NumberFormatException.class,
                ()-> testThrows.numberFols(),"Какоето сообщение");
    }

    @Test
    void testException(){
        Assertions.assertThrows(Exception.class,()-> Integer.parseInt("1"));
    }

}