package com.BugzTests;



public class Main {

    static int i=0;

    public static int fact(int n)
        {
            if(n==0)
                return 1;
            else
                return (n * fact(n-1) );
        }

    public static void main(String[] args) {


	// write your code here

        System.out.println(Main.fact(5));


    }
}
