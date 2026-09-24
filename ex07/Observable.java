package ex07;

public interface Observable<T> {
	void attachObserver(Observer<T> observer);

	void detachObserver(Observer<T> observer);

	void notifyObservers(T data);
}
