package by.belhard26.homework.homework6.task1;

import java.util.ArrayList;
import java.util.List;

public class DateFile {

   public static List<Book> getBookByAuthor (List<Book> books, String fname, String lname) {
    List <Book> result = new ArrayList<>();
    Author searchAuthor = new Author(fname, lname, 23);
     for (Book book : books) {
      for (Author author: book.getAuthors()){
      if ( book.getAuthors().contains(searchAuthor))
        

      {  result.add(book);

             break;} }   }
  


        
         return result;

   
} }



      

    

