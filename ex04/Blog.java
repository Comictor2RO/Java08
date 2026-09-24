package ex04;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Subject<String> {
	private final List<Observer<String>> observers = new ArrayList<>();
	private String latestPost;

	@Override
	public void attachObserver(Observer<String> observer) {
		observers.add(observer);
	}

	@Override
	public void detachObserver(Observer<String> observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer<String> observer : observers) {
			observer.update(latestPost);
		}
	}

	public void addPost(String post) {
		latestPost = post;
		notifyObservers();
	}
}
