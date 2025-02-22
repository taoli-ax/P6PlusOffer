package day4;

public abstract class Reader {
    protected  Book currentBook;

    public Reader(Book book) {
        this.currentBook = book;
    }

    public abstract void read();
}
