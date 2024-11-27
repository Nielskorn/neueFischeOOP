package org.neuefische.Groupetaskpackages;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    private ArrayList<Book>books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public Library() {
        books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void deleteBook(Book book){
        books.remove(book);
    }
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }



    @Override
    public String toString() {
        return "library:{"+ Arrays.toString(books.toArray())+"}";
//      String result="";
//        for (Book book : books) {
//          result=result+" "+book.toString();
//      }
//        return result;
    }
}
