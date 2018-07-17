package com.BugzTests;

public class BasketBall extends Sports implements GameInterface{

    int scoringIncrement;
    String teamName;

    public BasketBall()
    {
        this.setName("BasketBall");
        this.setNumberOfPlayers(5);

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

    public void setCoach(String Coach)
    {
        this.coach = coach;
    }

    public String getCoach ()
    {
        return coach;
    }

    @Override
    public String sub() {
        return "basketball player substituted";
    }

    @Override
    public String breakGame() {
        return "48 minutes halves for basketball";
    }

    @Override
    public String score() {
        return "they score how in basketball ?";
    }
}
