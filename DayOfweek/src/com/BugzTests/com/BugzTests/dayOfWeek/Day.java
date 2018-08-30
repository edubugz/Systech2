package com.BugzTests.com.BugzTests.dayOfWeek;

public class Day {

    final static int SUN = 0;
    final static int MON = 1;
    final static int TUE = 2;
    final static int WED = 3;
    final static int THU = 4;
    final static int FRI = 5;
    final static int SAT = 6;

    public int dayPassed;


    public Day(int day)
    {

        this.dayPassed = day;
        System.out.println(printDay(dayPassed));

    }

    public void setDay(int day)
    {
        this.dayPassed = day;

    }

    public void getDay()
    {
        System.out.println("the set day is "+printDay(dayPassed));
    }

    //returns the following day

    public String followingDay()
    {
        int day = dayPassed;
        if (day == SAT)
        {
            return printDay(day);
        }

        else
            {
                day = (day + 1) % 7;
        }
        return printDay(day);
    }


//this method returns the previous day
    public String previousDay()
    {
        int day = dayPassed;

        if (day == 0)
        {
            return printDay(day);
        }

        else
            {
                day = (day - 1) % 7;
        }
        return printDay(day);
    }


// this method returns a day in a future if you add some number of days
    public String futureDay(int ourDays)
    {
        int day = dayPassed;

        day = ((dayPassed + ourDays) -1 ) % 7;

        return printDay(day);

    }

    public String printDay(int dayToPrint)
    {
        switch (dayToPrint)
        {
            case SUN:
                return "Sunday";
            case MON:
                return "Monday";
            case TUE:
                return "Tuesday";
            case WED:
                return "Wednesday";
            case THU:
                return "Thursday";
            case FRI:
                return "Friday";
            case SAT:
                return "Saturday";
        }
        return "";
    }


}
