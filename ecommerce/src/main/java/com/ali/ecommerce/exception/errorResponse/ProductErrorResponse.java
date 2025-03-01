package com.ali.ecommerce.exception.errorResponse;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;


@Getter
@Setter
public class ProductErrorResponse {

    private final String message;
    private final LocalDateTime timestamp;
    private final HttpStatus httpStatus;

    public ProductErrorResponse(String message, LocalDateTime now, HttpStatus httpStatus) {
        this.message = message;
        this.timestamp = now;
        this.httpStatus = httpStatus;
    }
}
