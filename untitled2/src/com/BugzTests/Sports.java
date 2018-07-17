package com.BugzTests;

public class Sports {
    protected String name;
    protected String coach;
    protected int numberOfPlayers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public static void main(String[] args) {
        FootBall footOne = new FootBall();
        footOne.coach = "edwin";
        footOne.setTeamName("gor mahia");
        footOne.setScoringIncrement(1);
        System.out.println(footOne.getCoach());
        System.out.println(footOne.getScoringIncrement());
        System.out.println(footOne.getNumberOfPlayers());
        System.out.println(footOne.getCoach());
        System.out.println(footOne.sub());
        System.out.println(footOne.breakGame());
        System.out.println(footOne.score());



    }
}
