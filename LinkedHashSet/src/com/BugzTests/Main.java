package com.BugzTests;

import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {

        LinkedHashSet<String> students=new LinkedHashSet<String>();

        students.add("wambui");
        students.add("musili");
        students.add("edwin");
        students.add("vincent");

        //check if an element exist
        System.out.println("linked hash set contains \"vincent\"? "+students.contains("vincent"));
        System.out.println("linked hash set contains \"kish\" ? "+students.contains("kish"));

         //remove an element
        students.remove("musili");
        System.out.println("musili removed: "+students);







    }
}
