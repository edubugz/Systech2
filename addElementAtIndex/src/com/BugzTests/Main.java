package com.BugzTests;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList <String> students = new ArrayList<>();
        students.add("student1");
        students.add("student2");
        students.add("student3");
        students.add("student3");

        System.out.println(students);
        students.add(3,"student added");
        System.out.println(students);


    }
}
