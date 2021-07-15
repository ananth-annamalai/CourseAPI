package com.personal.couses.CourseAPI.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(value = {AppException.class})
    public ResponseEntity<ErrorMessage> exceptionHandler(AppException appException) {
        ErrorMessage errorMessage = new ErrorMessage(appException.getMessage(),HttpStatus.BAD_REQUEST,
                ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Z")));
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<ErrorMessage> commonException(Exception exception) {
        ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(),HttpStatus.BAD_REQUEST,
                ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Z")));
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }
}
