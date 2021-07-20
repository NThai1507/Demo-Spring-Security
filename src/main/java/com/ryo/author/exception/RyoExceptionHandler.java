package com.ryo.author.exception;

import com.ryo.author.entity.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpClientErrorException.Unauthorized;

import java.time.LocalDateTime;

@ControllerAdvice
public class RyoExceptionHandler {

    @ExceptionHandler(HttpClientErrorException.Forbidden.class)
    public ResponseEntity<ErrorResponse> forbidden() {

        return new ResponseEntity<ErrorResponse>(ErrorResponse.builder()
                .errorCode(HttpStatus.FORBIDDEN.toString())
                .errorTime(LocalDateTime.now())
                .httpStatus(HttpStatus.FORBIDDEN)
                .message(HttpStatus.FORBIDDEN.getReasonPhrase())
                .build(), HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(Unauthorized.class)
    public ResponseEntity<ErrorResponse> unauthorized() {

        return new ResponseEntity<ErrorResponse>(ErrorResponse.builder()
                .errorCode(HttpStatus.UNAUTHORIZED.toString())
                .errorTime(LocalDateTime.now())
                .httpStatus(HttpStatus.UNAUTHORIZED)
                .message(HttpStatus.UNAUTHORIZED.getReasonPhrase())
                .build(), HttpStatus.UNAUTHORIZED);
    }
}
