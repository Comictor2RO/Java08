package ex07;

import java.util.ArrayList;
import java.util.List;

public class ConcertNotifier implements Observable<ConcertEvent> {
	private final List<Observer<ConcertEvent>> followers = new ArrayList<>();

	@Override
	public void attachObserver(Observer<ConcertEvent> observer) {
		followers.add(observer);
	}

	@Override
	public void detachObserver(Observer<ConcertEvent> observer) {
		followers.remove(observer);
	}

	@Override
	public void notifyObservers(ConcertEvent event) {
		for (Observer<ConcertEvent> follower : followers) {
			follower.update(event);
		}
	}

	public void addConcertEvent(ConcertEvent event) {
		notifyObservers(event);
	}
}
