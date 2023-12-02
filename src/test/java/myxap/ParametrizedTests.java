package myxap;


import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedTests {
    public boolean isPalidrome(String str){
        return str == null ? false : StringUtils.reverse(str).equals(str);
    }


    @ParameterizedTest(name = "{index} - {0} is a palindrome")
    @ValueSource(strings = {"12321","pop","232","wsdsw"})
    void testPalindrome(String word){
        Assertions.assertTrue(isPalidrome(word));
    }

    @ParameterizedTest(name = "{index} - {0} is a palindrome")
    @NullSource
    void testPalindrome1(String word){
        Assertions.assertTrue(word == null);
    }



}


