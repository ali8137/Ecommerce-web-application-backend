package com.ali.ecommerce.exception;


public class StripePaymentException extends RuntimeException {
    public StripePaymentException(String message) {
        super(message);
    }
}
