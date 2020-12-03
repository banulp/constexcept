package com.example.constexcept.error;

import com.example.constexcept.error.BookErrorCode;

public class BookErrorResponse {
    private int code;
    private String message;
    private String description;

    public BookErrorResponse() {
    }

    public BookErrorResponse(BookErrorCode bookErrorCode, String description) {
        this.code = bookErrorCode.getCode();
        this.message = bookErrorCode.getMessage();
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
