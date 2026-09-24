package ex08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EsportsTournamentTest {
	public static void main(String[] args) {
		Tournament<EsportsTeam> tournament = new Tournament<>();

		tournament.addTeam(new EsportsTeam("Team Alpha", 3));
		tournament.addTeam(new EsportsTeam("Team Bravo", 1));
		tournament.addTeam(new EsportsTeam("Team Charlie", 2));

		RankingStrategy<EsportsTeam> positionStrategy = teams -> {
			List<EsportsTeam> rankedTeams = new ArrayList<>(teams);
			Collections.sort(rankedTeams);
			return rankedTeams;
		};

		List<EsportsTeam> ranking = positionStrategy.rank(tournament.getTeams());

		for (EsportsTeam team : ranking) {
			System.out.println(team.getPosition() + ". " + team.getName());
		}
	}
}
