package ex24;

import org.junit.jupiter.api.Test;

    import static ex24.app24.sort;
    import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import ex24.app24;
    import org.junit.jupiter.api.Test;
public @interface test24 {
    class testapp24 {

      //  private final Calculator calculator = new Calculator();
        @Test
        void sortEmptyString() {
            assertEquals("", sort(""));
        }
        @Test
        void badSortEmptyString() {
            assertNotEquals("a", sort(""));
        }
    }
}
