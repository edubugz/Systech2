package com.BugzTests;

public class VolleyBall extends  Sports implements GameInterface {
    int scoringIncrement;
    String teamName;

    public VolleyBall()
    {
        setName("VolleyBall");
        setNumberOfPlayers(6);

    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }


    public void setScoringIncrement(int score)
    {
        scoringIncrement = score;
    }

    public int getScoringIncrement()
    {
        return  scoringIncrement;
    }

    @Override
    public String sub() {
        return "volleyball player substituted";
    }

    @Override
    public String breakGame() {
        return "26 minutes halves for volleyball";
    }

    @Override
    public String score() {
        return "set is a killer in volleyball";
    }
}
