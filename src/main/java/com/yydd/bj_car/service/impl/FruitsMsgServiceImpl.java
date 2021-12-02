package com.yydd.bj_car.service.impl;

import com.yydd.bj_car.dao.FruitsMsgDao;
import com.yydd.bj_car.entity.ResponseData;
import com.yydd.bj_car.service.FruitsMsgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class FruitsMsgServiceImpl implements FruitsMsgService {

    @Resource
    private FruitsMsgDao fruitsMsgDao;

    @Override
    public ResponseData getList(Map<String, Object> queryMap) {

        ResponseData response = new ResponseData();

        response.setList(fruitsMsgDao.getList(queryMap));


        return response;
    }
}
