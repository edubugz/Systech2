package com.BugzTests;

import java.util.Arrays;

public class Main {

    public static int[] sortArr(int nums[] ) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > nums[i]) {

                    int temp = nums[i];

                    nums[j] = nums[i];
                    nums[i] = temp;

                }
            }


        }
        return nums;
    }

    public static int[] sort2(int nums [])
    {

        for(int i = 0; i<nums.length;i++)
        {
            int j;

            for(j = 0; j<nums.length;j++)
            {
                if(nums[j]> nums[i])
                {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                }

            }

        }

        return nums;
    }
    public static void main(String[] args) {
	// write your code here

        int [] nums = {7,8,5,9,3,1};

        System.out.println(Arrays.toString(Main.sortArr(nums)));
    }
}
