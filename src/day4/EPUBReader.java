package day4;

public class EPUBReader extends Reader {
    public EPUBReader(Book book) {
        super(book);
    }
    @Override
    public void read() {
        System.out.println("reading epub");
    }
}
