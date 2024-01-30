package com.kanti.attendancemanagementsystem.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

public class GlobalException {
    
    // handle specific exception(resource)
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> resourceNotFoundHandling(ResourceNotFoundException exception, WebRequest request){

        ErrorDetails errorDetails = new ErrorDetails(new Date(), exception.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    // Global exception
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> globalException(Exception exception, WebRequest webRequest){

        ErrorDetails errorDetails = new ErrorDetails(new Date(), exception.getMessage(), webRequest.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
