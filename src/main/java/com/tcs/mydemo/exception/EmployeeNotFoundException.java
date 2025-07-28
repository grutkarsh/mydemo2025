package com.tcs.mydemo.exception;

import org.springframework.http.HttpStatusCode;

public class EmployeeNotFoundException extends RuntimeException  {


    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
