package ex29;
//What is the rate of return? 0
//Sorry. That's not a valid input.
//What is the rate of return? ABC
//Sorry. That's not a valid input.
//What is the rate of return? 4
//It will take 18 years to double your initial investment.

import org.junit.jupiter.api.Test;

import static ex29.app29.doubleYourInvestment;

import static org.junit.jupiter.api.Assertions.assertEquals;

public @interface test29 {

    class testapp29 {

        @Test
        void correctInput() {
            assertEquals("It will take 18 years to double your initial investment.", doubleYourInvestment("4"));

        }
        @Test
        void incorrectInputZero() {
            assertEquals("Sorry. That's not a valid input.", doubleYourInvestment("0"));

        }
        @Test
        void incorrectInputABC() {
            assertEquals("Sorry. That's not a valid input.", doubleYourInvestment("ABC"));

        }
    }
}
