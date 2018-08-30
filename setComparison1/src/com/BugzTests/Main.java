package com.BugzTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static Set compareSets(Set a, Set b)
    {
        ArrayList<Set> min = getShortest(a,b);
        Set toreturn = new TreeSet();

        for (Object j: min.get(1) )
        {
            if(min.get(0).add(j))
            {
                continue;
            }
            else
            {
                toreturn.add(j);
            }
        }
        return toreturn;

    }

    public static ArrayList<Set> getShortest(Set a, Set b)
    {
        ArrayList<Set> twoSets = new ArrayList<>();
        if(a.size() > b.size())
        {
            twoSets.add(a);
            twoSets.add(b);
            return twoSets;
        }
        else if(b.size() > a.size())
        {
            twoSets.add(b);
            twoSets.add(a);
            return twoSets;
        }

        twoSets.add(a);
        twoSets.add(b);
        return twoSets;

    }


    public static void main(String[] args) {
	// write your code here
        TreeSet edu = new TreeSet();

        TreeSet edi = new TreeSet();

        edu.add(1);
        edu.add(33);
        edu.add(34);
        edu.add(55);
        edu.add(22);

        edi.add(1);
        edi.add(55);
        edi.add(34);
        edi.add(22);

        System.out.println(Arrays.toString(Main.compareSets(edu,edi).toArray()));




    }
}
