package ex00;

public class MultiFunctionDevice implements Printer, Scanner{
    @Override
    public Document print(String text) {
        return new Document(text);
    }

    @Override
    public String scan(Document document) {
        return document.getText();
    }
}
