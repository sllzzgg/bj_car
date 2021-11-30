package com.yydd.bj_car.controller;

/**
 * @description:
 * @author: zhangjj
 * @createDate: 2021/10/24
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/index","/"})
    public String indexPage(){

        return "index";
    }

}
