package com.example.constexcept.exception;

import com.example.constexcept.error.BookErrorCode;

/**
 * 직접 throw 할 때는 쓰고
 * annotation 할때는 ConstraintViolationException 가 발생 
 */
public class AwardException extends Exception{

    private BookErrorCode bookErrorCode;
    public AwardException() {
        this.bookErrorCode = BookErrorCode.NO_AWARD;
    }
    public AwardException(BookErrorCode bookErrorCode) {
        this.bookErrorCode = bookErrorCode;
    }

    public BookErrorCode getBookErrorCode() {
        return bookErrorCode;
    }

    public void setBookErrorCode(BookErrorCode bookErrorCode) {
        this.bookErrorCode = bookErrorCode;
    }
}
