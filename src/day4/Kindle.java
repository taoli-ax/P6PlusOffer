package day4;

import java.io.File;
import java.util.List;

public class Kindle {
    List<Book> library;

    public  void  uploadBook(Book book){

    }

    public void downloadBook(Book b){

    }

    public void  read(Book b){
       Reader reader = SimpleReadFactory.createReader(b);
       if(reader != null){
           reader.read();
       }

    }
    public void remove(Book b){}

}

