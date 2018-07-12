package com.BugzTests;

public class Main {

     static String theEnd(String str, boolean front)
     {
         if ( str.length()>=2)
         {
             if(front)
             {
                 return str.substring(0,1);
             }

             else if (!front)
             {
                 return str.substring(str.length()-1);
             }
         }

         return str;
     }

    public static void main(String[] args) {

        System.out.println(Main.theEnd("heloo",true));
        System.out.println(Main.theEnd("heloo",false));
    }
}
