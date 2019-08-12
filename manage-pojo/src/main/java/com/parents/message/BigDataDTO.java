package com.parents.message;

import lombok.Data;

import java.util.Date;

/**
 * @Author LIUHUAN
 * @Description
 * @Date Created by  2019/5/4 16:49
 **/

public class BigDataDTO {

    private String id;

    private String key;

    private String value;

    private Date date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
