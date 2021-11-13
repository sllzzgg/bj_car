package com.yydd.bj_car.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: zhangjj
 * @createDate: 2021/10/24
 */
public class ResponseData<T> {

    private String code;
    private String msg;
    private List<T> list;

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

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", list=" + list +
                '}';
    }
}
