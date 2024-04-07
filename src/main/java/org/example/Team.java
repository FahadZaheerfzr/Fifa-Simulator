package org.example;

public abstract class Team implements TeamInterface {
    private String name;
    private Player[] players;
    private int matches_won;
    private int matches_played;
    private int matches_drawn;
    private int goals_scored;
    private int goals_conceded;

    public Team(){
        this.matches_won = 0;
        this.matches_played = 0;
        this.matches_drawn = 0;
        this.goals_scored = 0;
        this.goals_conceded = 0;
    }
    public Team(String name, Player[] players) {
        this.name = name;
        this.players = players;
        this.matches_won = 0;
        this.matches_played = 0;
        this.matches_drawn = 0;
        this.goals_scored = 0;
        this.goals_conceded = 0;
    }

    public String getName() {
        return name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public int getMatches_won() {
        return matches_won;
    }

    public int getMatches_played() {
        return matches_played;
    }

    public int getMatches_drawn() {
        return matches_drawn;
    }

    public int getGoal_scored() {
        return goals_scored;
    }

    public int getGoals_conceded(){
        return goals_conceded;
    }


    public void match_won(){
        this.matches_won++;
        this.matches_played++;
    }

    public void match_drawn(){
        this.matches_drawn++;
        this.matches_played++;
    }

    public void match_lost(){
        this.matches_played++;
    }

    public void goal_scored(int goals){
        this.goals_scored += goals;
    }

    public void goal_conceded(int goals){
        this.goals_conceded+=goals;
    }

}
