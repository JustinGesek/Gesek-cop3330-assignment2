package ex26;

import org.junit.jupiter.api.Test;

import static ex26.app26.months;
import static org.junit.jupiter.api.Assertions.assertEquals;

public @interface test26 {
    //What is your balance? 5000
//What is the APR on the card (as a percent)? 12
//What is the monthly payment you can make? 100
//It will take you 70 months to pay off this card.
    class testapp26 {
        //The password '12345' is a very weak password.
        @Test
        void test_b5000_i100_p12() {
            assertEquals(70, months(5000, 12, 100));
        }
    }
}