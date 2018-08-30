package com.BugzTests.Anagram;

public class Anagram {
    static int size;
    static int count;
    static char[] arrChar = new char[100];

    public static void doAnagram(int newSize)
    {
        if(newSize == 1)
            return;
        for(int j=0; j<newSize; j++)
        {
            doAnagram(newSize-1);
            if(newSize==2)

            rotate(newSize);
        }
    }

    public static void rotate(int newSize)
    {
        int j;
        int position = size - newSize;
        char temp = arrChar[position];
        for(j=position+1; j<size; j++)
            arrChar[j-1] = arrChar[j];
        arrChar[j-1] = temp;
    }



    }


