package ex04;

public interface Subject<T> {
	void attachObserver(Observer<T> observer);

	void detachObserver(Observer<T> observer);

	void notifyObservers();
}
