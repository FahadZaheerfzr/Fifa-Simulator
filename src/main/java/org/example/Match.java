package org.example;
import java.util.Random;

public class Match {
    private Team teamA;
    private Team teamB;
    private int scoreA;
    private int scoreB;
    private String winner;

    private String venue;

    public Match(Team teamA, Team teamB, String venue) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.venue = venue;
    }


    public void setScoreA(int scoreA) {
        this.scoreA = scoreA;
    }

    public void setScoreB(int scoreB) {
        this.scoreB = scoreB;
    }

    public Team getTeamA() {
        return teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public int getScoreA() {
        return scoreA;
    }

    public int getScoreB() {
        return scoreB;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getVenue() {
        return venue;
    }
}
