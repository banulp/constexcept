package com.example.constexcept.model;

public class Book {
    private Integer bookId;
    private String bookTitle;
    private String bookAuthor;
    private String bookStory;
    private Integer bookStar;

    public Book() {
    }

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookStory() {
        return bookStory;
    }

    public void setBookStory(String bookStory) {
        this.bookStory = bookStory;
    }

    public Integer getBookStar() {
        return bookStar;
    }

    public void setBookStar(Integer bookStar) {
        this.bookStar = bookStar;
    }
}
