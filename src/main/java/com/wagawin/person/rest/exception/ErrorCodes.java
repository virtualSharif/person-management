package com.wagawin.person.rest.exception;


public enum ErrorCodes {

    PERSON_DOESNT_EXISTS(1000,"Specified person id doesn't exists"),
    CHILD_DOESNT_EXISTS(1001,"Specified child id doesn't exists" );

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    ErrorCodes(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
