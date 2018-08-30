package com.BugzTests;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void iterateKeys(Map map){

        for (Object key: map.keySet()) {

            System.out.println(key.toString());
        }
    }

    public static void main(String[] args) {
	// write your code here
        Map<Integer,String> students = new HashMap<Integer, String>();

        students.put(1, "student");
        students.put(2, "student");
        students.put(3, "student");
        students.put(4, "student");

        Main.iterateKeys(students);

    }
}
