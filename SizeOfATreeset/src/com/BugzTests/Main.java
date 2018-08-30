package com.BugzTests;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        //create TreeSet object
        TreeSet treeSet = new TreeSet();

    /*
      use
      int size()  method of TreeSet class To get the size.
    */
        System.out.println("Size of TreeSet : " + treeSet.size());

        //add elements to TreeSet object
        treeSet.add(new Integer("1"));
        treeSet.add(new Integer("2"));
        treeSet.add(new Integer("3"));

        System.out.println("Size of TreeSet after adding elements: " + treeSet.size());

        //remove one element from TreeSet using remove method
        treeSet.remove(new Integer("1"));
        System.out.println("Size of TreeSet after removing an element : " + treeSet.size());
    }
    }

