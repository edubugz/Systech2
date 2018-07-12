package com.BugzTests;
/*Given a string, return a version without the first 2 chars.
        Except keep the first char if it is 'a' and keep the second char if it is 'b'.
        The string may be any length. Harder than it looks.
        */
public class Main {

    public static String deFront(String str) {
        int length = str.length();
        String result = "";

        if(str.charAt(0) == 'a'){
            result += str.substring(0, 1);
        }
        if(str.charAt(1) == 'b'){
            result += str.substring(1, 2);
        }

        result += str.substring(2);

        return result;
    }
        public static void main(String[] args) {
       System.out.println(Main.deFront("h"));
            System.out.println(Main.deFront("avay"));
            System.out.println(Main.deFront("vbay"));


        }
    }

