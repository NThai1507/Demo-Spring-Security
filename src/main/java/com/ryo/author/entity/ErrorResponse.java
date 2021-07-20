package com.ryo.author.entity;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    private LocalDateTime errorTime;
    private String errorCode;
    private String message;
    private HttpStatus httpStatus;
}
