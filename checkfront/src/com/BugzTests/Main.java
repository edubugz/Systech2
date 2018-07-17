package com.BugzTests;

public class Main {

    public static String startWord(String str, String word) {

        if ( word.length()>1){

            if (word.substring(1).equals(str.substring(1,word.length())))
            {
                return str.substring(0,word.length());
            }
        }
        return str.substring(0,1);

    }



    public static void main(String[] args) {
	// write your code here
        System.out.println(Main.startWord("hippo","hi"));
        System.out.println(Main.startWord("hippo","xip"));
        System.out.println(Main.startWord("hippo","i"));

    }
}
