package com.personal.couses.CourseAPI.exception;

public class AppException extends RuntimeException{

    public AppException(String message) {
        super(message);
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }
}
