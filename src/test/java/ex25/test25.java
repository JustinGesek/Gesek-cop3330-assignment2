package ex25;
import org.junit.jupiter.api.Test;

import static ex25.app25.strength;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public @interface test25 {
    class testapp25 {
        //The password '12345' is a very weak password.
        @Test
        void testVeryWeakPassword() {
            assertEquals("The password '12345' is a very weak password.", strength("12345"));
        }
        //The password 'abcdef' is a weak password.
        @Test
        void testWeakPassword() {
            assertEquals("The password 'abcdef' is a weak password.", strength("abcdef"));
        }
//The password 'abc123xyz' is a strong password.
@Test
void testStrongPassword() {
    assertEquals("The password 'abc123xyz' is a strong password.", strength("abc123xyz"));
}
//The password '1337h@xor!' is a very strong password.
@Test
void testVeryStrongPassword() {
    assertEquals("The password '1337h@xor!' is a very strong password.", strength("1337h@xor!"));
}
    }

}
