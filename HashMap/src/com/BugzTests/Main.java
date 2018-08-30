package com.BugzTests;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hashtable<Integer,String> students = new Hashtable<>();

    //add key value pairs to the hashtable
        students.put(1,"edwin");
        students.put(2,"matha");
        students.put(3,"musili");
        students.put(4,"festo");

       //check for the existence of certain keys
        System.out.println("heck for the existence of certain keys");

        System.out.println("key 2 exists in Hashtable students ? : " + students.containsKey(2)+"\n");
        System.out.println("key 7 exists in Hashtable students ? : " + students.containsKey(7)+"\n");

        Set<Integer> keys = students.keySet();

        //iterate through the keys of hashtable
        System.out.println("iterate through the keys of hashtable \n");

        for(int keysInTable:students.keySet())
        {
            System.out.println(keysInTable);
        }

        //Iterate through values of hashtable
        System.out.println("Iterate through values of hashtable");

        for (String tableValues:students.values())
        {
            System.out.println(tableValues);
        }













    }
}
