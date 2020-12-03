package com.example.constexcept.error;

public enum BookErrorCode {
    NO_AUTHOR(911, "no author"),
    NO_BOOK(912, "no book"),
    NO_AWARD(913, "no award"),
    NO_PAGE(914, "no page");

    private int code;
    private String message;

    BookErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
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
}
