package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public String copyingArrs()
    {
        int [] copyFrom={1,2,3,4,5,6};
        int [] copyTo = new int[6];

        System.arraycopy(copyFrom,0,copyTo,0,5);

                 return Arrays.toString(copyTo);
    }


    public static void main(String[] args) {

        String input = "";
        boolean nullCheck = input.isEmpty(); ;
        if (nullCheck)
        {
            System.out.println("not empty")

        }
        else {
            System.out.println("empty");
        }


        }


    }

