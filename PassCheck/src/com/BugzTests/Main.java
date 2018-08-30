package com.BugzTests;

public class Main {

    public static boolean isValid(String pass)
    {
        int digCount = 0;
        if(pass.length()>=10 )
        {
            for(int i=0;i<pass.length();i++)
            {
                if( Character.isDigit(pass.charAt(i)) || Character.isLetter(pass.charAt(i)) )
                {
                    if (Character.isDigit(pass.charAt(i)))
                    {
                        digCount++;

                    }

                }

                else
                {
                    System.out.println(pass.charAt(i));
                    return false;

                }

            }

            if (digCount >=2)
            {
                return true;
            }

        }


        return false;


    }

    public static void main(String[] args) {
	// write your code here

        System.out.println(Main.isValid("grwe33rewerty"));
    }
}
