package com.BugzTests.readFile;


import java.io.*;

public class LongString {

    public static String readFile( File file)
    {
        String longest="";
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

        }

        return longest;

    }

}
