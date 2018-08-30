package com.BugzTests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here


        // Creating a HashMap of int keys and String values
        HashMap<Integer, String> students = new HashMap<Integer, String>();

        // Adding Key and Value pairs to students
        students.put(1,"edwin");
        students.put(2,"festo");
        students.put(3,"musili");
        students.put(4,"wambo");
        students.put(5,"vincent");

        System.out.println("map"+students+"\n");
        // Checking Key Existence
        boolean flag = students.containsKey(1);
        System.out.println("Key 1 exists in HashMap? : " + flag);

        boolean flag2 = students.containsKey(5);
        System.out.println("Key 5 exists in HashMap? : " + flag2);

        boolean flag3 = students.containsKey(39);
        System.out.println("Key 39 exists in HashMap? : " + flag3+"\n");

        //converte keys of the map to a list
        System.out.println("Convert keys of a map to List");
        List<Integer> mapkeys = new ArrayList<>(students.keySet());
        System.out.println(mapkeys+"\n");

        //convert the values of a map to a list
        System.out.println("Convert values of a map to List");
        List<String> mapValues = new ArrayList<>(students.values());
        System.out.println(mapValues);

    }
}
