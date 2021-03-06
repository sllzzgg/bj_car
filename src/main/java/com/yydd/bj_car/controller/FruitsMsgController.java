package com.yydd.bj_car.controller;

import com.yydd.bj_car.entity.ResponseData;
import com.yydd.bj_car.service.FruitsMsgService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;


@Controller
public class FruitsMsgController {

    @Resource
    private FruitsMsgService fruitsMsgService;

    @ResponseBody
    @RequestMapping("/fruits/list")
    public ResponseData getFruitData(@RequestBody Map<String, Object> queryMap){

        ResponseData res = fruitsMsgService.getList(queryMap);
        return res;
    }

}
