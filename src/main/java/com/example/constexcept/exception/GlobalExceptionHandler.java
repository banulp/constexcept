package com.example.constexcept.exception;

import com.example.constexcept.error.BookErrorResponse;
import com.example.constexcept.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;

//@ControllerAdvice
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @Autowired
    private BookService bookService;

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    String handleConstraintViolationException(ConstraintViolationException e) {
        return "Invalid param in globalexception : " + e.getMessage();
    }

    @ExceptionHandler(AwardException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    BookErrorResponse handleAwardException(AwardException e) {
        return new BookErrorResponse(e.getBookErrorCode(), "consider another award." + bookService.validAwardRegx());
//        return new BookErrorResponse(e.getBookErrorCode(), "consider another award.");
    }

    @ExceptionHandler(PageException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    BookErrorResponse handlePageException(PageException e) {
        return new BookErrorResponse(e.getBookErrorCode(), "consider another page.");
    }
}
