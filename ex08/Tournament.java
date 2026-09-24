package ex08;

import java.util.ArrayList;
import java.util.List;

public class Tournament<T extends Team> {
    private List<T> teams = new ArrayList<>();

    public void addTeam(T team){
        teams.add(team);
    }

    public List<T> getTeams(){
        return teams;
    }
}
