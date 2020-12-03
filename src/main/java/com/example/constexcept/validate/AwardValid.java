package com.example.constexcept.validate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

@Constraint(validatedBy = AwardValidator.class)
@Target({ METHOD, FIELD, PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface AwardValid {
    String message() default "Invalid Award in annotation check.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}