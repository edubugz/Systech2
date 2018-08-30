package com.BugzTests.portionOfArrayList;

import java.util.ArrayList;

public class ArrayPortion {

    public static ArrayList  getPortion(ArrayList e,int start, int end)
    {
        ArrayList<Object> toReturn = new ArrayList<>();

        Object[] arr = e.toArray();

        if (start > e.size() && end <= e.size())
        {
            for (int i = start; i <= end; i++)
            {

                toReturn.add(arr[i]);

            }
        }

        return toReturn;

    }


}
