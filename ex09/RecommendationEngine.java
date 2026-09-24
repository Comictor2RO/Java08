package ex09;

import java.util.List;

public class RecommendationEngine<T extends Content> {
    private final RecommendationAlgorithm<T> algorithm;

    RecommendationEngine(RecommendationAlgorithm<T> algorithm){
        this.algorithm = algorithm;
    }

    public List<T> recommend(List<T> contents, User user){
        return algorithm.recommend(contents, user);
    }
}
