package day4;


public class SimpleReadFactory {
    public static Reader createReader(Book book) {
        if(book.format==Format.PDF){
            return new PDFReader(book);
        }
        else if (book.format==Format.EPUB){
            return new EPUBReader(book);
        }
        else if (book.format==Format.MOBI){
            return new MOBIReader(book);
        }
        return null;
    }
}
