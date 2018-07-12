package com.BugzTests;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void powers()
    {


    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter a :");
        int a = in.nextInt();
        System.out.println("enter b :");
        int b = in.nextInt();
        System.out.println("enter n :");
        int n = in.nextInt();

        for (int j = 0; j < n; j++) {
            a += b;
            System.out.print(a + " "); b *= 2;
        }
        in.close();



    }
}
