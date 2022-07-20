package com.shopping.gateway.exception;


public class JwtTokenException extends RuntimeException {
    public String errorMessage;
    public JwtTokenException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }
}
