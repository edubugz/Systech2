package com.BugzTests;

public class FootBall extends Sports implements GameInterface{

    int scoringIncrement;
    String teamName;

    public FootBall()
    {
        setName("football");
        setNumberOfPlayers(11);

    }

    public String getTeamName()
    {
        return teamName;
    }

    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }



    public void setCoach(String coach)
    {
        this.coach = coach;
    }

    public String getCoach ()
    {
        return coach;
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
        return "player substituted";
    }

    @Override
    public String breakGame() {
        return "45 minutes halves for football";
    }

    @Override
    public String score() {
        return "1-1";
    }



}
