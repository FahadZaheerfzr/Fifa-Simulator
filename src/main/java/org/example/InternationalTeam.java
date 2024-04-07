package org.example;

public class InternationalTeam extends Team {
    private String country;
    private int world_cup_won;

    public InternationalTeam(){

    }

    public InternationalTeam(String name, Player[] players, int world_cup_won) {
        super(name, players);
        this.country = name;
        this.world_cup_won = world_cup_won;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getWorld_cup_won() {
        return world_cup_won;
    }

    public void setWorld_cup_won(int world_cup_won) {
        this.world_cup_won = world_cup_won;
    }
}
