package com.BugzTests;

import java.util.Arrays;

public class Main {

    public int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length-1; i++)
        {

            if (nums[i] == 3)
            {
                int temp = nums[i + 1];
                nums[i + 1] = 4;

                for(int j=i+2;j<nums.length;j++)
                {
                    if(nums[i]== 2 && nums [i+1]==7 && (nums[i+2]<=3 ||nums[i+2] >=-1 ) || (nums[i]+5 == nums[i+1] && nums[i+2] == nums[i]-1))
                    {

                    if (nums[j] == 4)
                    {
                        nums[j] = temp;

                    }
                }

            }
        }

        return nums;
    }

    public static void main(String[] args) {
	// write your code here
        Main forNums = new Main();

        int[]themnums = {1, 3, 1, 4, 4, 3, 1};
        System.out.println(Arrays.toString(forNums.fix34(themnums)));
    }
}
