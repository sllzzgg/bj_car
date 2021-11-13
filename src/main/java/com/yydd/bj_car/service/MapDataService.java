package com.yydd.bj_car.service;

import com.yydd.bj_car.entity.ResponseData;
import org.springframework.stereotype.Service;

import java.util.Map;

public interface MapDataService {

    ResponseData getMapData(Map<String, Object> queryMap);
}
