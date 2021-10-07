package ex38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;


import static ex38.app38.filterEvenNumbers;
import static org.junit.jupiter.api.Assertions.*;

public @interface test38 {

    class testapp38 {
        @Test
        void goodStat() {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            numbers.add(6);
            numbers.add(7);
            numbers.add(8);
            ArrayList <Integer> result = filterEvenNumbers(numbers);
            result.forEach((n) -> assertTrue(n % 2 == 0));
        }
    }
}