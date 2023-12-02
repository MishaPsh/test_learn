package myxap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void fizzbuzz() {
        Assertions.assertArrayEquals(fizzBuzz.fizzbuzz(3), "fizz".getBytes());
    }
    @Test
    void fizzbuzz2() {
        Assertions.assertArrayEquals(fizzBuzz.fizzbuzz(5), "buzz".getBytes());
    }
    @Test
    void fizzbuzz3() {
        Assertions.assertArrayEquals(fizzBuzz.fizzbuzz(15), "fizzbuzz".getBytes());
    }
     @Test
    void fizzbuzz4(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> fizzBuzz.fizzbuzz(1));
     }

}