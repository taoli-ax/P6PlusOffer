package day4;

import java.io.File;
import java.util.List;

public class Kindle {
    List<Book> library;

    public  void  uploadBook(File f){

    }

    public void downloadBook(Book b){

    }

    public void  read(Book b){
       Reader strategy = SimpleReadFactory.createReader(b);
    }
    public void remove(Book b){}

}

