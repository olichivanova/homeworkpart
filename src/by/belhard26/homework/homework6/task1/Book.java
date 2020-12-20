package by.belhard26.homework.homework6.task1;

import java.util.Arrays;
import java.util.List;

import static by.belhard26.homework.homework6.task1.BookFormat.A3;

public class Book  {
   private static final String DEFAULT_TITALE = "default titeles";
   private static final int DEFAULT_PAGES = 15;
   private static final List<Author> DEFAULT_AUTHORS = Arrays.asList(new Author("no name", "no lastname", 55)) ;
   private static final BookFormat DEFAULT_FORMAT = A3;


    private String titeles;
    private int numberPages;
    private BookFormat format;
    private List<Author> authors;

    public Book(String titeles, int numberPages, BookFormat format, List<Author> authors) {
        if (titeles == null || titeles.isEmpty())
            titeles = DEFAULT_TITALE;
        if (numberPages <= 2)
            numberPages = DEFAULT_PAGES;
        if (authors == null)
            authors = DEFAULT_AUTHORS;
        if (format == null)
            format = DEFAULT_FORMAT;



        this.titeles = titeles;
        this.numberPages = numberPages;
        this.format = format;
        this.authors = authors;
    }

    public String getTiteles() {
        return titeles;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public BookFormat getFormat() {
        return format;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titeles='" + titeles + '\'' +
                ", numberPages=" + numberPages +
                ", format=" + format +
                ", authors=" + authors +
                '}';
    }
}




