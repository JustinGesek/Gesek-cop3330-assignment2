package ex39;

import java.util.*;
import java.lang.Math;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Justin Gesek
 */
//Name                | Position          | Separation Date
//--------------------|-------------------|----------------
//Jacquelyn Jackson   | DBA               |
//Jake Jacobson       | Programmer        |
//John Johnson        | Manager           | 2016-12-31
//Michaela Michaelson | District Manager  | 2015-12-19
//Sally Weber         | Web Developer     | 2015-12-18
//Tou Xiong           | Software Engineer | 2016-10-05
//Constraint
//Store the data using a list of maps.
//First Name	Last Name	Position	Separation Date
//John	Johnson	Manager	2016-12-31
//Tou	Xiong	Software Engineer	2016-10-05
//Michaela	Michaelson	District Manager	2015-12-19
//Jake	Jacobson	Programmer
//Jacquelyn	Jackson	DBA
//Sally	Webber	Web Developer	2015-12-18
public class app39 {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> employees = new ArrayList<HashMap<String,String>>();
        HashMap<String,String> employee = new HashMap<String, String>();
        employee.put("First Name", "John");
        employee.put("Last Name", "Johnson");
        employee.put("Position", "Manager");
        employee.put("Separation Date", "2016-12-31");
        employees.add(employee);
        employee = new HashMap<String, String>();
        employee.put("First Name", "Tou");
        employee.put("Last Name", "Xiong");
        employee.put("Position", "Software Engineer");
        employee.put("Separation Date", "2016-10-05");
        employees.add(employee);
        employee = new HashMap<String, String>();
        employee.put("First Name", "Michaela");
        employee.put("Last Name", "Michaelson");
        employee.put("Position", "District Manager");
        employee.put("Separation Date", "2015-12-19");
        employees.add(employee);
        employee = new HashMap<String, String>();
        employee.put("First Name", "Jake");
        employee.put("Last Name", "Jacobson");
        employee.put("Position", "Programmer");
        employee.put("Separation Date", "");
        employees.add(employee);
        employee = new HashMap<String, String>();
        employee.put("First Name", "Jacquelyn");
        employee.put("Last Name", "Jackson");
        employee.put("Position", "DBA");
        employee.put("Separation Date", "");
        employees.add(employee);
        employee = new HashMap<String, String>();
        employee.put("First Name", "Sally");
        employee.put("Last Name", "Webber");
        employee.put("Position", "Web Developer");
        employee.put("Separation Date", "2015-12-18");
        employees.add(employee);
        Collections.sort(employees, new MapComparator("Last Name"));
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");

        for (int i = 0; i < employees.size(); ++i)
        {
           employee = employees.get(i);
            String name = employee.get("First Name")+" "+employee.get("Last Name");
            System.out.printf("%-19s | %-17s | %-15s\n", name, employee.get("Position"), employee.get("Separation Date"));
        }
    }
    static class MapComparator implements Comparator<Map<String, String>>

    {
        private final String key;

        public MapComparator(String key)
        {
            this.key = key;
        }

        public int compare(Map<String, String> first,
                           Map<String, String> second)
        {
            String firstValue = first.get(key);
            String secondValue = second.get(key);
            return firstValue.compareTo(secondValue);
        }
    }

    }
