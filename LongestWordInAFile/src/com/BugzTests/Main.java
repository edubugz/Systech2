package com.BugzTests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static String readFile( File file)
    {
        String longest="xx";


        try
        {

            FileReader fileToRead = new FileReader(file);
            BufferedReader bis = new BufferedReader(fileToRead);

            String readLine ="";

            while((readLine = bis.readLine()) != null)
            {

                String [] str = readLine.split(" ");

                for(int i = 0; i< str.length;i++)
                {
                    if(longest.length()>str[i].length())
                    {
                        continue;
                    }
                    else
                    {
                        longest = str[i];

                    }

                }
            }

        }

        catch (IOException e)
        {
            System.out.println(e.getMessage());

        }

        return longest;

    }

    public static void main(String[] args) {
	// write your code here

        File e = new File("C:\\Users\\User\\Documents\\yak.txt");

        System.out.println(Main.readFile(e));
    }
}
