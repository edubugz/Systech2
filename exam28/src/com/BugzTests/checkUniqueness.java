package com.BugzTests;

public class checkUniqueness {

    public static boolean checkUniqueness(String str)
    {
        for(int i = 0; i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
	// write your code here

        System.out.println(checkUniqueness.checkUniqueness("edwini"));
    }
}
