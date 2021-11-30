package com.yydd.bj_car.admin.user;

import com.yydd.bj_car.entity.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Map;

@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping("/admin/user/login")
    public ResponseData loginUser(@RequestBody Map<String, Object> params){

        String  username = (String)params.get("user_name");
        String  password = (String)params.get("password");

        if (username.equals("test") && password.equals("1234")){
            ResponseData res = new ResponseData();
            res.setStatus(1);

            logger.info("有人登陆了！");

            return res;
        }
        return null;
    }

    @ResponseBody
    @RequestMapping("/admin/user/signout")
    public ResponseData  signOut(){

        ResponseData res = new ResponseData();
        res.setStatus(1);

        return res;
    }


}
