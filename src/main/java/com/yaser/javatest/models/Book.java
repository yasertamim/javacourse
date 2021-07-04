package com.yaser.javatest.models;

import java.time.Instant;
import java.util.List;

public class Book {
    private String author;
    private Instant releaseDate ;
    private Integer pages;
    private String title;
    private String isbn;
    private BookType type;
    private List<String> translations;

    public Book (String author, Instant releaseDate, Integer pages,
                 String title, String isbn, BookType type, List<String> translations) {
        this.author = author;
        this. releaseDate = releaseDate;
        this.pages = pages;
        this.title = title;
        this.isbn = isbn;
        this.type = type;
        this.translations = translations;
    }

    public String getAuthor() {return this.author;}
    public Instant getReleaseDate() {return this.releaseDate;}
    public Integer getPages() {return this.pages;}
    public String getTitle() {return this.title;}
    public String getIsbn() {return this.isbn;}
    public BookType getType() {return this.type;}
    public List<String> getTranslations() {return this.translations;}

    public void setAuthor() {this.author = author;}
    public void setReleaseDate() {this.releaseDate = releaseDate;}
    public void setPages() {this.pages = pages; }
    public void setTitle() {this.title = title;}
    public void setIsbn() {this.isbn = isbn;}
    public void setType() {this.type = type;}
    public void setTranslations() {this.translations = translations;}


}
