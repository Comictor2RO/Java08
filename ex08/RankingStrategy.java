package ex08;

import java.util.List;

public interface RankingStrategy<T extends Team> {
    List<T> rank(List<T> teams);
}
