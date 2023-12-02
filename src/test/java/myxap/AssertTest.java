package myxap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Тестовые утверждения")
public class AssertTest {
    @Test
    @DisplayName("Использование ассертов")
    public void test() {
        int a = 2;
        int b = 2;
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = "ss";
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[3];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        int[] array3 = {1, 2, 4};

        List<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> arrayList2 = new ArrayList<>(Arrays.asList(1, 2, 3));

        List<String> arrayList3 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> arrayList4 = new ArrayList<>(Arrays.asList("a", "b", "c"));

        // Assertions.assertSame(a,b);
        // Assertions.assertNotSame(a,b);
        // Assertions.assertEquals(str1, str2,"Строки равны правильно");
        // Assertions.assertNotEquals(str1, str2, "Строки равны не правильно");
        // Assertions.assertArrayEquals(array1, array2 ,":(");
        // Assertions.assertIterableEquals(arrayList1, arrayList2);
        // Assertions.assertLinesMatch(arrayList3,arrayList4);
        // Assertions.assertNull(null);
        // Assertions.assertNotNull(null);
        //Assertions.assertTrue(true);
        // Assertions.assertFalse(false);
//         Assertions.assertTimeout(Duration.ofMillis(500), ()-> {
//             System.out.println("Start");
//        //     Thread.sleep(600);
//             System.out.println("Finish");
//         });
//
//         Assertions.assertTimeoutPreemptively(Duration.ofMillis(500), ()->{
//             System.out.println("Start");
//             Thread.sleep(500);
//             System.out.println("Finish");
//         });
//        Assertions.assertThrows(ClassCastException.class, () -> {
//            throw new ClassCastException();
//        });
//        Assertions.assertThrows(NullPointerException.class, ()->{
//            throw new NullPointerException();
//        });
        //Assertions.fail();
    }
}

