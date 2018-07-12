package com.BugzTests;

public class Main {

    public static String left2(String str)
    {
        StringBuilder sb = new StringBuilder();

        if (str.length() > 2){
          sb.append(str.substring(2));
          sb.append(str.substring(0,2));

          return sb.toString();
        }

        return str;
    }

    public static void main(String[] args) {
	// write your code here

        System.out.println(Main.left2("edwin"));
        System.out.println(Main.left2("in"));
        System.out.println(Main.left2("out"));
        System.out.println(Main.left2(" "));
    }
}
