package myxap;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @BeforeAll
     static void beforeAll(){
        System.out.println("BeforeAll");
    }
    @BeforeEach
    void beforeEach(RepetitionInfo info){
        System.out.println("BeforeEach");
        int currentRepetition = info.getCurrentRepetition();
        int totalRepetition = info.getTotalRepetitions();
        System.out.println(currentRepetition);
        System.out.println(totalRepetition);
    }

    @DisplayName("Add operation test")
    @RepeatedTest(value = 5, name = RepeatedTest.LONG_DISPLAY_NAME)
    void sumNumber(TestInfo testInfo) {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(2, calculator.sum(1,1),"1+1 should equai 2");
        System.out.println("Test");
        System.out.println(testInfo.getDisplayName());
    }

    @AfterAll()
    static void afterAll(){
        System.out.println("AfterAll");
    }
    @AfterEach()
    void afterEach(){
        System.out.println("AfterEach");
    }

}