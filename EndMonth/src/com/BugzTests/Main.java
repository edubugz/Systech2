package com.BugzTests;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    //reverse an array
    public void reverseArray(int[] nums) {
        int hold;

        try {
            System.out.println("what way do you want to sort the array \n 1:ascending \n 2: descending");

            String choice = in.readLine();

            switch (choice) {
                case "1":
                    for (int i = 0; i < nums.length - 1; i++) {
                        for (int j = 0; j < nums.length - 1; j++) {
                            if (nums[j] > nums[j + 1]) {
                                hold = nums[j + 1];
                                nums[j + 1] = nums[j];
                                nums[j] = hold;
                            }
                        }
                    }
                    System.out.println(Arrays.toString(nums));

                    break;


                case "2":
                    for (int i = 0; i < nums.length - 1; i++) {
                        for (int j = 0; j < nums.length - 1; j++) {
                            if (nums[j] < nums[j + 1]) {
                                hold = nums[j + 1];
                                nums[j + 1] = nums[j];
                                nums[j] = hold;
                            }
                        }
                    }
                    System.out.println(Arrays.toString(nums));
                    break;

                    default:
                        System.out.println("please enter a valid choice");
                        System.exit(0);


        }

    }
        catch (IOException e)
        {e.printStackTrace();}

        finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
    // Write a program in Java to reverse any String without using StringBuffer

    public void reverseString(String s)
    {
        String reversed ="";
        for(int i=s.length()-1;i>=0;i--)
        {
            reversed=reversed+s.charAt(i);

        }

        System.out.println("the reversed string is: --> "+ reversed);
    }



//    Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of
//    elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array


    public void spanOfvalue(int[] nums, int i) //array passed and the int to use in finding inclusive range
    {
        if(nums.length>0)
        {
             int []inclusiveRange =  new int[nums.length];
             inclusiveRange = Arrays.copyOfRange(nums,  Arrays.toString(nums).indexOf(i),  Arrays.toString(nums).lastIndexOf(i));

            System.out.println(Arrays.toString(inclusiveRange));

        }
        else
        {
            System.out.println(i+" doesn't exist");
        }
    }








    //2. A stack is an abstract data type for adding and removing elements.
    // The last element added to a stack is the first element that is removed (last-in-first-out, LIFO). Design and implement a stack


    public void implementingStack()
    {
        ArrayList<String> customStack = new ArrayList<>();


        try{

            System.out.println("what do you want to do with the stack ? \n 1: push \n2: pop \n3: view stack");
            String answer = in.readLine();


            switch(answer)
            {
                case "1":
                    System.out.println("enter the item to push");
                    String itemToPush = in.readLine();
                    customStack.add(itemToPush);
                    System.out.println("success,the stack --> "+customStack);
                    continueWithStack();
                    break;

                case"2":
                    if(customStack.size()>0)
                    System.out.println("write item to pop ---> "+customStack);
                    String itemToPop = in.readLine();
                    if(customStack.remove(itemToPop))
                    {
                        System.out.println("success,item removed --> " +customStack);
                        continueWithStack();
                    }
                    else
                    {
                        System.out.println("item not in stack");
                        continueWithStack();

                    }
                    break;

                case"3":
                    if(customStack.size()>0)
                    {
                        System.out.println(customStack);
                        continueWithStack();
                    }
                    else
                    {
                        System.out.println("no items in stack");
                        continueWithStack();
                    }
                    break;

                    default:
                        System.out.println("invalid choice");
                        implementingStack();


            }


        }

        catch (IOException e){}


    }
    private void continueWithStack() {
        System.out.println("do you wish to continue manipulating stack? \n:[Y] for yes ____ [N] for No");

        try {
            String reply = in.readLine();

            switch (reply) {
                case "y":
                    implementingStack();
                    break;

                case "n":
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.exit(0);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
	// write your code here

        Main newS = new Main();

        int nums []  ={1,2,3,4,5,2};
        newS.implementingStack();
    }
}
