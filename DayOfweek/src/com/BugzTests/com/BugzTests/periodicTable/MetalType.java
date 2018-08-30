package com.BugzTests.com.BugzTests.periodicTable;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MetalType {

    private int groupID;
    private String name;
    private int protons;

    public String getName() {
        return "its science name is: " + name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getProtons() {
        return "the number of protons are: " + protons;
    }

    public void setProtons(int protons) {
        this.protons = protons;
    }

    public String getGroupID() {
        return "metal group is " + metalGroup(this.groupID);
    }

    public String metalGroup(int id) {
        Map<Integer, String> groups = new HashMap<>();

        groups.put(1, "alkali Iron");
        groups.put(2, "poor Iron");

        return "group id for the metal is: " + groups.get(id);
    }

    //How the program will run

    public static void main(String[] args) {

        System.out.println("which metal do you want to view details for");

        System.out.println("1: iron \n 2: Lead ");

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        switch (input) {
            case "1":
                Iron m1 = new Iron();
                System.out.println(m1.getName());
                System.out.println(m1.getProtons());
                System.out.println(m1.getGroupID());

            case "2":
                Lead m2 = new Lead();
                System.out.println(m2.getName());
                System.out.println(m2.getProtons());
                System.out.println(m2.metalGroup(2));


        }


    }
}

