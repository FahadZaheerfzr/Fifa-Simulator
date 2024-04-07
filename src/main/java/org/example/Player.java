package org.example;

public class Player {


    private String name;
    private int number;
    private int goal_scored;
    private String playing_position;


    public Player(String name, int number, String playing_position) {
        this.name = name;
        this.number = number;
        this.goal_scored = 0;
        this.playing_position=playing_position;
    }






    public String getPlaying_position() {
        return playing_position;
    }

    public int getGoal_scored() {
        return goal_scored;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void goal_scored(){
        this.goal_scored+=1;
    }

    @Override
    public String toString() {
        return this.number + " " + this.name;
    }


}
