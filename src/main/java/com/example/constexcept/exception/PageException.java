package com.example.constexcept.exception;

import com.example.constexcept.error.BookErrorCode;

public class PageException extends Exception{

    private BookErrorCode bookErrorCode;

    public PageException(BookErrorCode bookErrorCode) {
        this.bookErrorCode = bookErrorCode;
    }

    public BookErrorCode getBookErrorCode() {
        return bookErrorCode;
    }

    public void setBookErrorCode(BookErrorCode bookErrorCode) {
        this.bookErrorCode = bookErrorCode;
    }

}
