package ex05;

/*
    Double functioneaza pentru ca are deja metoda compareTo
    Daca as incerca cu o clasa proprie care nu implementeaza Comparable codul
    nu ar compila
*/

public class UpperBoundedCollectionsTest {
	public static void main(String[] args) {
		SortedList<Integer> integers = new SortedList<>();
		integers.add(5);
		integers.add(1);
		integers.add(3);

		SortedList<Double> doubles = new SortedList<>();
		doubles.add(2.5);
		doubles.add(1.1);
		doubles.add(3.7);

		System.out.println("Lista de Integer: " + integers.getElements());
		System.out.println("Lista de Double: " + doubles.getElements());
	}
}
