package ex31;
//TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
//Example Output
//Resting Pulse: 65        Age: 22
//
//Intensity    | Rate
//-------------|--------
//55%          | 138 bpm
//60%          | 145 bpm
//65%          | 151 bpm
//:               :        (extra lines omitted)
//85%          | 178 bpm
//90%          | 185 bpm
//95%          | 191 bpm
//Constraints
//Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
//Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering valid inputs.
//Display the results in a tabular format.
import org.junit.jupiter.api.Test;

import static ex31.app31.targetHeartRate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public @interface test31 {

    class testapp31 {

        @Test
        void i55_a22_r65() {
            assertEquals("55%          | 138 bpm", targetHeartRate(55, 22, 65));

        }
        @Test
        void i60_a22_r65() {
            assertEquals("60%          | 145 bpm", targetHeartRate(60, 22, 65));

        }
        @Test
        void i65_a22_r65() {
            assertEquals("65%          | 151 bpm", targetHeartRate(65, 22, 65));

        }
    }
}
//few more change intensity and name
