package com.parents.common;

import lombok.Data;


public class ResponseDTO {

    private String code = "00";

    private String message = "成功";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
