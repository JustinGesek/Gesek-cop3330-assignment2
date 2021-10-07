package ex28;

import org.junit.jupiter.api.Test;

import static ex28.app28.sum;

import static org.junit.jupiter.api.Assertions.assertEquals;

public @interface test28 {

    class testapp28 {

        @Test
        void correctSum() {
            int[] values = new int[]{                    1,2,3,4,5};
            assertEquals(15, sum(values));

        }

    }
}//finish