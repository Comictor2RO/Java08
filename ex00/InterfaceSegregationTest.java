package ex00;

public class InterfaceSegregationTest {
	public static void main(String[] args) {
		MultiFunctionDevice device = new MultiFunctionDevice();

		Document document = device.print("Exemplu de document");
		String scannedText = device.scan(document);

		System.out.println("Text scanat: " + scannedText);
	}
}
