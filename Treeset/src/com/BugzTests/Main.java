package com.BugzTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Main  {



    public static void main(String[] args) {

        //declare the treeset
        TreeSet<Integer> oneToTen=new TreeSet<>();

        //student objects

        for(int i = 0;i<=10;i++){
            oneToTen.add(i);

        }





        System.out.println("the set "+oneToTen);

        //convert the set to an objects array
        //Object[] numsToArr = oneToTen.toArray();
        System.out.println(Arrays.toString(oneToTen.toArray()));


            //check first and last values
        System.out.println("first value: "+oneToTen.first());
        System.out.println("last value: "+oneToTen.last());

    }


}
