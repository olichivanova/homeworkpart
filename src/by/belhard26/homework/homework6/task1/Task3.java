package by.belhard26.homework.homework6.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        Author author1 = new Author("Vasily" , "Ivanov", 54 );
        Author author2 = new Author("Igor", "Petrov" , 23);
        Author author3 = new Author("Tatuana", "Vasislieve", 31) ;

        Book book1 = new Book("Belye krilya", 231, BookFormat.A5, Collections.singletonList(author1) );
        Book book2 = new Book("Sinie paltsi", 40, BookFormat.A3, Collections.singletonList(author2));
        Book book3 = new Book("Rozovie zamki", 15, BookFormat.A4 , Arrays.asList(author1, author3) );
        Book book4 = new Book("Chernye kliushki", 128, BookFormat.A4, Arrays.asList(author2, author3));

         List <Book> books = Arrays.asList(book1, book2, book3, book4);
         List<Book> booksByAuthor = DateFile.getBookByAuthor(books, "Igor", "Petrov");
        System.out.println(booksByAuthor);
        System.out.println(books.toString());
    }
           

         }
    


