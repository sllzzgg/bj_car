package com.yydd.bj_car.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: zhangjj
 * @createDate: 2021/10/24
 */
public class ResponseData {

    private String code;
    private String msg;
    private Object list;

    private Integer status = 1;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getList() {
        return list;
    }

    public void setList(Object list) {
        this.list = list;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
