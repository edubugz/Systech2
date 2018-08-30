package com.BugzTests;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

            HashSet<String> hSet = new HashSet<String>();

            hSet.add(new String("car"));
            hSet.add(new String("house"));
            hSet.add(new String("school"));

            Object[] objArray = hSet.toArray();

            for (Object obj : objArray)
                System.out.println(obj);
    }
}
