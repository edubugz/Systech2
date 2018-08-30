package com.BugzTests.com.BugzTests.minimumDistanceArray;

import java.util.*;

public class ArrayDistance {


    public static int sortArray( int[] nums )
    {
        int index=0;

        int [] nums2 = new int[nums.length];

        //deep copy
        for(int i=0;i<nums.length;i++)
        {
            nums2[i]=nums[i];
        }

        Arrays.sort(nums);
        int first = nums[0];

        for(int i = 0;i<nums2.length;i++)
        {
           if(first == nums2[i])
           {
               index=i;
               break;
           }
        }

        return index;

    }
//
//
//  public static void main(String[] args) {
//      int [] nums = {4 ,8 ,6 ,1 ,2 ,9,4};
//      System.out.println(ArrayDistance.sortArray(nums));
//
//    }
}
