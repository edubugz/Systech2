package com.BugzTests;

import java.util.Arrays;

public class Main {


        public static void main(String[] args) {
            String [][] names =
                    { {"edwin","phide", "elly","jose","cathy"},{"wanyoike","shiku","mwangi"}};


                int j=0;
           for (int i=0;i<names[0].length;i++)
           {
               System.out.print(names[0][i]+"\t");
               if (j<=names[1].length-1)
               {
                   System.out.print(names[1][j]);
                   j++;
               }
               System.out.println();




               }

               }
           }




