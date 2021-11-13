package com.yydd.bj_car.dao;

import com.yydd.bj_car.entity.MapData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface MapDataDao {

    List<MapData> getList(@Param("param") Map<String, Object> queryMap);
}
