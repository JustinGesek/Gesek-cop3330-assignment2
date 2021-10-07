package ex27;

import org.junit.jupiter.api.Test;

import static ex27.app27.checkAddress;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public @interface test27 {
    //Enter the first name: John
//Enter the last name: Johnson
//Enter the ZIP code: 55555
//Enter the employee ID: TK-4321
    class testapp27 {

        @Test
        void correctAddress() {
            assertEquals("There were no errors found.", checkAddress("John", "Johnson", "TK-4321", 55555));

        }

        @Test
        void emptyFirstName() {
            assertEquals("The first name must be filled in.", checkAddress("", "Johnson", "TK-4321", 55555));

        }

        @Test
        void shortFirstName() {
            assertEquals("The first name must be at least 2 characters long.", checkAddress("a", "Johnson", "TK-4321", 55555));

        }

        @Test
        void emptyLastName() {
            assertEquals("The last name must be at least 2 characters long.", checkAddress("John", "", "TK-4321", 55555));
        }

        @Test
        void shortLastName() {
            assertEquals("The last name must be at least 2 characters long.", checkAddress("John", "a", "TK-4321", 55555));
        }

        @Test
        void shortZip() {
            assertNotEquals("The zip must be 5 characters long.", checkAddress("John", "Johnson", "TK-4321", 5555));
        }

        @Test
        void checkId() {
            assertEquals("The employee ID must be in the format of AA-1234.", checkAddress("John", "Johnson", "4321-TK", 55555));
        }

    }
}