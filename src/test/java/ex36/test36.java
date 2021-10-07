package ex36;
//Enter a number: 100
//Enter a number: 200
//Enter a number: 1000
//Enter a number: 300
//Enter a number: done
//Numbers: 100.0, 200.0, 1000.0, 300.0
//The average is 400.0
//The minimum is 100.0
//The maximum is 1000.0
//The standard deviation is 353.5533905932738
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


import static ex36.app36.stat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public @interface test36 {

    class testapp36 {
        @Test
        void goodStat() {
            ArrayList<Double> numbers = new ArrayList<Double>();
            numbers.add(100.0);
            numbers.add(200.0);
            numbers.add(1000.0);
            numbers.add(300.0);

            assertEquals("The average is 400.0\n" +
                    "The minimum is 100.0\n" +
                    "The maximum is 1000.0\n" +
                    "The standard deviation is 353.5533905932738\n", stat(numbers));
        }
    }
}
//make bad stat and change a number in number.add and leave the txt so its the wrong number.