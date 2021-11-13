package com.yydd.bj_car.service.impl;

import com.yydd.bj_car.dao.MapDataDao;
import com.yydd.bj_car.entity.MapData;
import com.yydd.bj_car.entity.ResponseData;
import com.yydd.bj_car.service.MapDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: zhangjj
 * @createDate: 2021/10/24
 */
@Service
public class MapDataServiceImpl implements MapDataService {

    @Resource
   private MapDataDao mapDataDao;

    @Override
    public ResponseData getMapData(Map<String, Object> queryMap) {

        ResponseData responseData = new ResponseData();

        List<MapData> mapData = mapDataDao.getList(queryMap);

        responseData.setList(mapData);

        return responseData;
    }
}
