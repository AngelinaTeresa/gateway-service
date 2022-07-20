package com.shopping.gateway.model;


public class ErrorObject {
    private String errorMessage;
    private String httpStatus;

    public ErrorObject(String errorMessage, String httpStatus) {
        this.errorMessage = errorMessage;
        this.httpStatus = httpStatus;
    }
}
