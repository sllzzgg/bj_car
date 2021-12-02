package com.yydd.bj_car.service;

import com.yydd.bj_car.entity.ResponseData;

import java.util.Map;

public interface FruitsMsgService {
    ResponseData getList(Map<String, Object> queryMap);
}
