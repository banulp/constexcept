package com.example.constexcept.controller;

import com.example.constexcept.model.Book;
import com.example.constexcept.service.BookService;
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
public class ParamController {

    @Autowired
    private BookService bookService;

    @GetMapping("/awards/{award}/getBooks")
    public List<Book> getBooks(
            @PathVariable (required=true) @Pattern(regexp = "newberry|changbi", message = "not allowed str") String award
            , @RequestParam(required=true, defaultValue="10") @Min(value = 5, message = "more 5 size") @Max(value = 30, message = "less 30 size") int size
    ){
        return bookService.getBookList(award, size);
    }

    @GetMapping("/awards/{award}/getBooks2")
    public List<Book> getBooks2(
            @PathVariable (required=true) @Pattern(regexp = "newberry|changbi", message = "not allowed str") String award
            , @RequestParam(required=true, defaultValue="10") int size
    ){
        return bookService.getBookList(award, size);
    }

}
