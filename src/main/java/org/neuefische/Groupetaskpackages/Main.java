package org.neuefische.Groupetaskpackages;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1=new Book("Herry","jimbob",10,"22BN1257AAFA");
        Book book2=new Book("Herry2","jimbob",10,"22BN1257AAFA");
        Library library=new Library();
        ArrayList<Book>books=new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        library.setBooks(books);
        System.out.println(library.toString());
        library.deleteBook(book1);
        System.out.println(library.toString());
        library.addBook(book1);
        System.out.println(library.toString());

    }
}
