package com.BugzTests;

import java.util.ArrayList;

public class Main {

    public static ArrayList getPortion(ArrayList e, int start, int end)
    {
        ArrayList<Object> toReturn = new ArrayList<>();

        Object[] arr = e.toArray();

        if (start < e.size() && end <= e.size())
        {
            for (int i = start; i <= end; i++)
            {


                toReturn.add(arr[i]);

            }
        }

        return toReturn;

    }

    public static void main(String[] args) {

        ArrayList <Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);


        System.out.println( Main.getPortion(arr,3,7));
	// write your code here
    }
}
