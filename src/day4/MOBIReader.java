package day4;

public class MOBIReader extends Reader {
    public MOBIReader(Book book) {
        super(book);
    }
    @Override
    public void read() {
        System.out.println("reading mobi");
    }
}
