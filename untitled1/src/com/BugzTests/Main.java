package com.BugzTests;

public class Main {

    public static String withoutX2(String str)

    {
        int i = 0;

        if (str.charAt(i)=='x' && str.charAt(i+1)=='x')
        {
            return str.substring(2);
        }

        else if (str.charAt(i)=='x' && str.charAt(i+1)!='x')
        {
            return str.substring(1);
        }
        else if (str.charAt(i)!='x' && str.charAt(i+1)=='x')
        {
            return str.substring(0,1)+str.substring(2);
        }
        return  str;

    }

    public static void main(String[] args) {

        System.out.println(Main.withoutX2("xHi"));
        System.out.println(Main.withoutX2("Hioi"));
        System.out.println(Main.withoutX2("Hxsxi"));
    }
}
