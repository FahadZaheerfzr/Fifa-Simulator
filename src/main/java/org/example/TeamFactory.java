package org.example;

public class TeamFactory extends AbstractTeamFactory {
        @Override
        public Team getTeam(String teamType) {
            if (teamType.equalsIgnoreCase("International")) {
                return new InternationalTeam();
            } else if (teamType.equalsIgnoreCase("Club")) {
                return new Club();
            }
            return null;
        }
}
