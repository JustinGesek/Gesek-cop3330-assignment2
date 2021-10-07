package ex34;
// ArrayList<String> employees = new ArrayList <String>();
//        employees.add("John Smith");
//        employees.add("Jackie Jackson");
//        employees.add("Chris Jones");
//        employees.add("Amanda Cullen");
//        employees.add("Jeremy Goodwin");
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static ex34.app34.removeEmployee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public @interface test34 {

    class testapp34 {

        @Test
        void removeChrisJones() {
            ArrayList<String> employees = new ArrayList <String>();
            employees.add("John Smith");
            employees.add("Jackie Jackson");
            employees.add("Chris Jones");
            employees.add("Amanda Cullen");
            employees.add("Jeremy Goodwin");


            assertEquals("John Smith\nJackie Jackson\nAmanda Cullen\nJeremy Goodwin\n", removeEmployee(employees, "Chris Jones"));

        }
        @Test
        void dontRemoveChrisJones() {
            ArrayList<String> employees = new ArrayList <String>();
            employees.add("John Smith");
            employees.add("Jackie Jackson");
            employees.add("Chris Jones");
            employees.add("Amanda Cullen");
            employees.add("Jeremy Goodwin");


            assertNotEquals("John Smith\nJackie Jackson\nChris Jones\nAmanda Cullen\nJeremy Goodwin\n", removeEmployee(employees, "Chris Jones"));

        }
    }
}
