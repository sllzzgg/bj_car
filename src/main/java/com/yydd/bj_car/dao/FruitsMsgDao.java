package com.yydd.bj_car.dao;

import com.yydd.bj_car.entity.Fruits;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface FruitsMsgDao {
    List<Fruits> getList(@Param("param") Map<String, Object> queryMap);
}
