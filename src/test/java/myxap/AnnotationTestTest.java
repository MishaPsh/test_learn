package myxap;

import org.junit.jupiter.api.*;

@DisplayName("Тестовый класс")
class AnnotationTestTest {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("@BeforeAll");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("@AfterAll");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("@AfterEach");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }
    //@Disabled

    @Test
    @DisplayName("Рассчет комиссии")
    public void test1() {
        System.out.println("@Test");
    }
    @Test
    public void test2(){
        System.out.println("@Test2");
    }

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class InnerClassTest{
        @BeforeAll
        public  void beforeAll(){
            System.out.println("@BeforeAll in innerClass");
        }

        @AfterAll
        public void afterAll(){
            System.out.println("@AfterAll in innerClass");
        }

        @AfterEach
        public void afterEach(){
            System.out.println("@AfterEach in innerClass");
        }

        @BeforeEach
        public void beforeEach() {
            System.out.println("@BeforeEach in innerClass");
        }
        @Test
        public void test1() {
            System.out.println("@Test in innerClass");
        }
        @Test
        public void test2(){
            System.out.println("@Test2 in innerClass");
        }
    }


}