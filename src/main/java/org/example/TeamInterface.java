package org.example;

public interface TeamInterface {
    void match_won();
    void match_drawn();
    void match_lost();
    void goal_scored(int g);
    void goal_conceded(int g);
}
