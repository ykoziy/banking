package com.ykz.banking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "User Exception")
public class UserException extends Exception {
    public UserException(String errorMessage) {
        super(errorMessage);
    }
}
