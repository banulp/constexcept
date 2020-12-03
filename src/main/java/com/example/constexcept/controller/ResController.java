package com.example.constexcept.controller;

import com.example.constexcept.exception.AwardException;
import com.example.constexcept.model.Book;
import com.example.constexcept.service.BookService;
import com.example.constexcept.validate.AwardValid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.util.List;

@RestController
@Validated
@RequestMapping(value = "banulp.lv", produces = "application/json;charset=UTF-8")
public class ResController {

    @Autowired
    private BookService bookService;

    @GetMapping("/awards/{award}/getBook")
    public List<Book> getBooks(
            @PathVariable (required=true) String award
            , @RequestParam(required=true, defaultValue="10") int size
    ) throws AwardException {
//    ) {
        if(!award.matches(bookService.validAwardRegx())) {
            throw new AwardException();
//            try {
//                throw awardException;
//            } catch (AwardException e) {
//                e.printStackTrace();
//            }
        }
        return bookService.getBookList(award, size);
    }

    @GetMapping("/awards/{award}/getBook2")
    public List<Book> getBooks2(
            @PathVariable (required=true) String award
            , @RequestParam(required=true, defaultValue="10") int size
    ) throws AwardException {
        return bookService.getException();
    }

    @GetMapping("/awards/{award}/getBook3")
    public List<Book> getBooks3(
            @PathVariable (required=true) @AwardValid String award
            , @RequestParam(required=true, defaultValue="10") int size
    ) {
        return bookService.getBookList(award, size);
    }
}
