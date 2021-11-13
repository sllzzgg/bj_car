package com.yydd.bj_car.controller;

/**
 * @description:
 * @author: zhangjj
 * @createDate: 2021/10/24
 */

import com.yydd.bj_car.entity.ResponseData;
import com.yydd.bj_car.service.MapDataService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;

@Controller
public class Index {

    @RequestMapping("/index")
    public String indexPage(){

        return "Index";
    }

}
