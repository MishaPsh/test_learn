package myxap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest1 {

    Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvSource({"1,1,2","2,3,5","2,2,4","5,5,10"})
    public void testCalc(int a, int b, int d){
        Assertions.assertEquals(d,calculator.sum(a,b));
    }

}