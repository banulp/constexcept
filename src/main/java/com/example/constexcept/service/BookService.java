package com.example.constexcept.service;


import com.example.constexcept.exception.AwardException;
import com.example.constexcept.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class BookService {

    public List<Book> getBookList(String award, int size){
        List<Book> list = new ArrayList<>();
        IntStream.range(0,size).forEach(i -> {
            list.add(new Book(award));
        });
        return list;
    }

    public List<Book> getException() throws AwardException {
        throw new AwardException();
    }

    public String validAwardRegx(){
        return "newberry|changbi";
    }
}