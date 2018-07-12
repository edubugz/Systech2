package com.BugzTests;

import java.io.*;
public class Main {


    public static void main(String[] args) {
        try
        {
            FileOutputStream fileToWrite = new FileOutputStream("C:\\Users\\User\\Downloads\\writeTest.txt");
            fileToWrite.write(65);
            fileToWrite.close();
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
