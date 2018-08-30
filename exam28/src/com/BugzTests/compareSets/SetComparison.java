package com.BugzTests.compareSets;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SetComparison {

    public  Set compareSets(Set a,Set b)
    {
        ArrayList<Set>min = getShortest(a,b);
        Set toreturn = new TreeSet();

            for (Object j: min.get(0) )
            {
                if(min.get(1).add(j))
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

    public ArrayList<Set> getShortest(Set a, Set b)
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
}
