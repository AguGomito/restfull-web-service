package com.RestFulWebService.demo.ws.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class AppExceptionsHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest request) {

        String errorMessageDescription = ex.getLocalizedMessage();

        if (errorMessageDescription == null)
            errorMessageDescription = ex.toString();

        ErrorMessageEntity errorMessageEntity = new ErrorMessageEntity(new Date(), errorMessageDescription);

        return new ResponseEntity<>(
                errorMessageEntity, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

    @ExceptionHandler(value = {NullPointerException.class})
    public ResponseEntity<Object> handleNullPointerException(NullPointerException ex, WebRequest request) {

        String errorMessageDescription = ex.getLocalizedMessage();

        if (errorMessageDescription == null)
            errorMessageDescription = ex.toString();

        ErrorMessageEntity errorMessageEntity = new ErrorMessageEntity(new Date(), errorMessageDescription);

        return new ResponseEntity<>(
                errorMessageEntity, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

    @ExceptionHandler(value = {UserServiceException.class})
    public ResponseEntity<Object> handleUserServiceException(UserServiceException ex, WebRequest request) {

        String errorMessageDescription = ex.getLocalizedMessage();

        if (errorMessageDescription == null)
            errorMessageDescription = ex.toString();

        ErrorMessageEntity errorMessageEntity = new ErrorMessageEntity(new Date(), errorMessageDescription);

        return new ResponseEntity<>(
                errorMessageEntity, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}
