package com.BugzTests.com.BugzTests.removeArrayDuplicates;

import sun.tools.jar.Main;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Duplicates {

    public static <T> Object[] removeDuplicates(T[] e)
    {
        Object [] noDuplicates = new Object[e.length];
        if(e.length>1)
        {
            for (int i = 0; i <e.length;i++)
            {
                for(int j = i+1;j<e.length;j++)
                {
                    if ( e[i].equals(e[j]) )
                    {

                        noDuplicates[i]="duplicate";
                        break;

                    }

                    noDuplicates[i] = e[i];
                }


            }

        }
        else
        {
            return e;

        }

        return  noDuplicates;
    }

    public static void main(String[] args) {
        // write your code here

        Integer [] nums ={2,3,4,5,7,7,8,9};
        System.out.println(Arrays.toString(Duplicates.removeDuplicates(nums)));
    }



}
