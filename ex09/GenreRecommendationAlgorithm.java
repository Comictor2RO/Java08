package ex09;

import java.util.ArrayList;
import java.util.List;

public class GenreRecommendationAlgorithm<T extends Content> implements RecommendationAlgorithm<T>{
    
    @Override 
    public List<T> recommend(List<T> contents, User user){
        List<T> recommendations = new ArrayList<>();

        for(T content : contents){
            if(content.getGenre().equalsIgnoreCase(user.getGenre()))
                recommendations.add(content);
        }

        return recommendations;
    }
}
