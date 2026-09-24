package ex09;

import java.util.List;

public interface RecommendationAlgorithm<T extends Content>{
    List<T> recommend(List<T> contents, User user);
}
