package ex09;

import java.util.ArrayList;
import java.util.List;

public class StreamingService<T extends Content> {
    private final List<T> contents = new ArrayList<>();
    private final List<User> users = new ArrayList<>();
    private final RecommendationEngine<T> engine;

    public StreamingService(RecommendationEngine<T> engine) {
        this.engine = engine;
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public void addContent(T content) {
        contents.add(content);
        notifyUsers(content);
    }

    private void notifyUsers(T content) {
        for (User user : users) {
            List<T> recommendations =
                    engine.recommend(List.of(content), user);

            for (T recommendation : recommendations) {
                user.receiveRecommendation(recommendation);
            }
        }
    }
}
