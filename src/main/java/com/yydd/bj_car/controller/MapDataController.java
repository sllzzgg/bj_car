package com.yydd.bj_car.controller;

import com.yydd.bj_car.entity.ResponseData;
import com.yydd.bj_car.service.MapDataService;
import com.yydd.bj_car.utils.HttpUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
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

    Logger logger = LogManager.getLogger(this.getClass());

    @Resource
    private MapDataService mapDataService;


    /**
     * 拍摄点
     * @return
     */
    @ResponseBody
    @RequestMapping("/mapData")
    public ResponseData getMapData(){

        Map<String, Object> queryMap = new HashMap<>();

        logger.info("访问地图");

        return mapDataService.getMapData(queryMap);
    }

    /**
     * 解析地址
     * @return
     */
    @ResponseBody
    @RequestMapping("/getAdress")
    public Map<String, Object> getAdress(String beginAdress, String endAdress){


        if(StringUtils.isBlank(beginAdress) || StringUtils.isBlank(endAdress)){
            return null;
        }

        String begin = HttpUtil.sendGet(beginAdress);
        String end = HttpUtil.sendGet(endAdress);

        HashMap<String, Object> map = new HashMap<>();

        map.put("begin",begin);
        map.put("end",end);

        return map;
    }

}
