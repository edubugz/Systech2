package com.BugzTests;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static String[] allSwap(String[] strings) {
        Map <Integer,String> map = new LinkedHashMap<>();

        for(int i = 0; i<strings.length;i++)
        {
            map.put(i,strings[i]);

        }

        for (Map.Entry<Integer, String> entry : map.entrySet())
        {
           //System.out.println(entry.getKey() + "/" + entry.getValue());

            char first = entry.getValue().charAt(0);
            int mapPointer = entry.getKey()+1;

            for(int i = mapPointer;i<strings.length;i++)
            {
                if(first == strings[i].charAt(0))
                {
                    strings[entry.getKey()] = strings[i];
                    strings[i] = entry.getValue();
                    map.put(i,"00");
                    break;
                }
            }
        }

        return strings;
    }


    public static void main(String[] args) {
	// write your code here
       String [] strings = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        String [] xx = {"ay", "by", "ax", "bx", "aj", "ai", "by", "bx"};
       String[] kova = Main.allSwap(strings);

        System.out.println(Arrays.toString(kova));


    }
}
