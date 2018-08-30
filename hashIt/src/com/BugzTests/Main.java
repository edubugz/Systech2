package com.BugzTests;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        Map <Integer,String> students = new HashMap<Integer, String>();

        students.put(1,"edwin");
        students.put(2,"shiku");
       // students.put(2,"mwangi");
        students.put(3,"mum");

        System.out.println(students.entrySet());
        System.out.println(students.keySet());
        System.out.println(students.containsValue("shiku"));
        System.out.println(students.containsKey(5));
        System.out.println(students.hashCode());
        students.clear();
        System.out.println(students.entrySet());
        System.out.println("(");
        File file = new File("spc.f");
        FileReader reader = new FileReader("spc.f");
        System.out.println(file.getName());



    }
}
