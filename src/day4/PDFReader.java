package day4;

public class PDFReader extends Reader{

    public PDFReader(Book book) {
        super(book);
    }
    @Override
    public void read() {
        System.out.println("reading pdf");
    }
}
