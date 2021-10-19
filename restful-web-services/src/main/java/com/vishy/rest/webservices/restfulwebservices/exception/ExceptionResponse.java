package com.vishy.rest.webservices.restfulwebservices.exception;

import java.util.Date;

public class ExceptionResponse {
    //timestamp
    private Date timestamp;
    //message
    private String message;
    //Details
    private String details;

    public ExceptionResponse(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this. details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}