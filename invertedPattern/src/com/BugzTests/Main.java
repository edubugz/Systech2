package com.BugzTests;

public class Main {

       static public void main(int n)
       {
           int spaces=n;

           for (int i=0;i<n;i++)
           {
               for(int j = spaces;j<=n;j++)
               {
                   System.out.print(" ");
               }

               for (int k = 0;k<spaces;k++)
               {
                   System.out.print("*");
               }

               System.out.println();
               spaces --;

           }

       }
    public static void main(String[] args) {
	// write your code here
        Main.main(5);
    }
}
