package com.BugzTests;

public class Main {


    public int calculateFactroial(int a) {
        int factorial;
        int multiplier = a-1;

        for (int i=0;i<a;i++)
        {
            factorial = a*multiplier;

            multiplier --;

        }

        return factorial;
    }

    public static void main(String[] args) {
	// write your code here

        Main newNum = new Main();
        System.out.println(newNum.calculateFactroial(4));
    }
}
