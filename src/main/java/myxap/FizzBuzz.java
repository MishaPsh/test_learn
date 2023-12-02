package myxap;

import javax.print.DocFlavor;

public class FizzBuzz {
    public byte[] fizzbuzz(int value) {
        if (value % 3 == 0) {
            return  "fizz".getBytes();
        }
        if (value % 5 == 0) {
            return "buzz".getBytes();
        }
        if (value % 3 == 0 && value % 5 == 0) {
            return "fizzbuzz".getBytes();
        }
         throw new IllegalArgumentException("Ввели некоректные данные");
    }
}
