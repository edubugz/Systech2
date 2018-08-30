package com.BugzTests;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Creating a HashMap of int keys and String values
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

        // Adding Key and Value pairs to HashMap
        hashmap.put(1,"student one");
        hashmap.put(2,"student 2");
        hashmap.put(3,"Student 3");
        hashmap.put(4,"student 4");
        hashmap.put(5,"student 5");

        // Checking Value Existence
        boolean flag = hashmap.containsValue("student one");
        System.out.println("String student one exists in HashMap? : " + flag);

        flag = hashmap.containsValue("student 6");
        System.out.println("Strin student 6 exists in HashMap? : " + flag);
    }
    }

