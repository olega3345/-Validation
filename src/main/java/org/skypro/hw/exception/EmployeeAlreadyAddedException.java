package org.skypro.hw.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpStatusCodeException;

public class EmployeeAlreadyAddedException extends HttpStatusCodeException {

    public EmployeeAlreadyAddedException(String message) {
        super(HttpStatus.BAD_REQUEST, message);
    }
}
