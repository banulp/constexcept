package com.example.constexcept.validate;

import com.example.constexcept.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AwardValidator implements ConstraintValidator<AwardValid, String> {

    // it works.
    @Autowired
    private BookService bookService;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
//        return value.matches("newberry|changbi");
        return value.matches(bookService.validAwardRegx());
    }
}
