package com.BugzTests;

import java.io.FileInputStream;
import java.io.IOException;

public class readFile {
    public void readFileContent(FileInputStream file) throws IOException {

         //try to read the file and output the chars to the screen
        try
        {
            int i = 0;
            while ((i = file.read()) != -1) {
                System.out.print((char) i);


            }
        }

        catch (Exception e)
        {
            System.out.println(e);    //print errors encountered in the IO operation

        }

        finally
        {
            file.close();  //releases any system resources associated with the stream
        }

    }
}



