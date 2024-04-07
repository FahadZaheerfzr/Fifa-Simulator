package org.example;

public class Club extends Team {
    private String league;
    private int tournaments_won;
    private float rating;

    public Club(){

    }
    public Club(String name, Player[] players, String league, int tournaments_won, float rating) {
        super(name, players);
        this.league = league;
        this.tournaments_won = tournaments_won;
        this.rating = rating;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public int getTournaments_won() {
        return tournaments_won;
    }

    public void setTournaments_won(int tournaments_won) {
        this.tournaments_won = tournaments_won;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
