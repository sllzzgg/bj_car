package com.yydd.bj_car.controller;

import com.yydd.bj_car.entity.ResponseData;
import com.yydd.bj_car.service.MapDataService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: zhangjj
 * @createDate: 2021/10/24
 */
@Controller
public class MapDataController {


    @Resource
    private MapDataService mapDataService;


    @ResponseBody
    @RequestMapping("/mapData")
    public ResponseData getMapData(){

        Map<String, Object> queryMap = new HashMap<>();

        ResponseData response = mapDataService.getMapData(queryMap);

//        System.out.println(response);
        return response;
    }


}
