package com.wagawin.person.business.enums;


public enum HouseType {

    FLAT(1,"Flat"),
    ESTATE(2,"Estate"),
    HOUSE(3, "House");

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    HouseType(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
