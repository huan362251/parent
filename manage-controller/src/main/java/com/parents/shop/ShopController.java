package com.parents.shop;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author LIUHUAN
 * @Description
 * @Date Created by  2019/5/4 20:24
 **/
@RestController
@RequestMapping("/shopController")
@Api(value = "测试")
public class ShopController {

    @PostMapping("/test")
    @ApiOperation(value="测试用接口", notes="测试用接口" ,httpMethod="POST")
    public void test(){
        System.out.printf("测试");
    }
}
