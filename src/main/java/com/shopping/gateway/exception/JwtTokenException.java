package com.shopping.gateway.exception;


public class JwtTokenException extends Exception {
    public JwtTokenException(String errorMessage) {
        super(errorMessage);
    }
}
