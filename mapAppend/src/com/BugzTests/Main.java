package com.BugzTests;

import java.util.*;

public class Main {
    public static String wordAppend(String[] strings) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        List<String> list = Arrays.asList(strings);
        Set<String> set = new LinkedHashSet<>(list);
        System.out.println(set);

        String toAppend = "";

        for (String st : set)
        {
            int count = 0;
            for(int j=0;j<strings.length;j++)
            {

                if(  st.equals(strings[j]) )

                {
                    count++;
                    if(count%2 == 0)
                    {
                        toAppend += strings[j];

                    }

                }

            }
        }

        return toAppend;

    }



    public static void main(String[] args) {
	// write your code here

       String [] arr =  {"not", "and", "or", "and", "this", "and", "or", "that", "not"};

        System.out.println(Main.wordAppend(arr));
    }
}
