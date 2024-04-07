package org.example;

import java.util.Random;

public class MatchCondutor {
    private Random rand;

    private static MatchCondutor instance = new MatchCondutor();

    //make the constructor private so that this class cannot be
    //instantiated
    private MatchCondutor(){
        rand = new Random();
    }

    //Get the only object available
    public static MatchCondutor getInstance(){
        return instance;
    }
    public void conductMatch(Match m ){
        System.out.println("Hello and Welcome to all our viewers across the world from " + m.getVenue() + " for the " +
                "match between " + m.getTeamA().getName() + " and " + m.getTeamB().getName());

        Player[] playersA = m.getTeamA().getPlayers();
        Player[] playersB = m.getTeamB().getPlayers();

        int[] goals = goals(playersA, playersB, m.getTeamA().getName(), m.getTeamB().getName());

        int goals_A = goals[0];
        int goals_B = goals[1];

        m.setScoreA(goals_A);
        m.setScoreB(goals_B);
        if(m.getScoreA()>m.getScoreB()){
            m.setWinner(m.getTeamA().getName());
            System.out.println("\n***********\t" + m.getWinner() + " won the game by " +  m.getScoreA() + " goals to " + m.getScoreB() + "\t**********" );
            m.getTeamA().match_won();
            m.getTeamB().match_lost();
        }else if (m.getScoreB() > m.getScoreA()){
            m.setWinner(m.getTeamB().getName());
            System.out.println("\n**********\t" + m.getWinner() + " won the game by " +  m.getScoreB() + " goals to " + m.getScoreA() + "\t**********");
            m.getTeamB().match_won();
            m.getTeamA().match_lost();
        }else{
            m.setWinner("Draw");
            System.out.println("\n*********\tThe match ended up as draw with score " + goals_A + "-" + goals_B+ "\t**********");
            m.getTeamA().match_drawn();
            m.getTeamB().match_drawn();
        }

        m.getTeamA().goal_scored(m.getScoreA());
        m.getTeamA().goal_conceded(m.getScoreB());
        m.getTeamB().goal_conceded(m.getScoreA());
        m.getTeamB().goal_scored(m.getScoreB());
    }

    public int[] goals(Player[] playersA, Player[] playersB, String teamA, String teamB) {
        int goals_A = 0;
        int goals_B = 0;

        for (int i = 0; i < 90; i++) {
            int goal_scoredA = rand.nextInt(100);
            int goal_scoredB = rand.nextInt(100);

            if (goal_scoredA == 6) {
                goals_A++;
                int player_scored = rand.nextInt(11);
                playersA[player_scored].goal_scored();
                System.out.println("\n " + playersA[player_scored].toString() + " scored for " + teamA +
                        " at " + i + "th minute");
                continue;
            }

            if (goal_scoredB == 4) {
                goals_B++;
                int player_scored = rand.nextInt(11);
                playersB[player_scored].goal_scored();
                System.out.println("\n " + playersB[player_scored].toString() + " scored for " + teamB +
                        " at " + i + "th minute");
            }
        }

        int[] goals = {goals_A, goals_B};
        return goals;
    }
}

