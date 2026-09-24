package ex03;

public class GenericsTest {
	public static void main(String[] args) {
		Pair<String, Integer> student = new Pair<>("Andrei", 20);
		Pair<Integer, Double> price = new Pair<>(10, 25.50);

		System.out.println("Student: " + student);
		System.out.println("Nume: " + student.getFirst());
		System.out.println("Varsta: " + student.getSecond());

		System.out.println("Pret: " + price);
	}
}
