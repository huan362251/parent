package com.parents.message.controller;

import com.parents.message.service.MessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author LIUHUAN
 * @Description
 * @Date Created by  2019/5/4 16:36
 **/
@RestController
@RequestMapping("/messageController")
@Api(value = "测试消息")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping("/queryMessage.do")
    @ApiOperation(value = "测试用接口", notes = "测试用接口", httpMethod = "POST")
    public void queryMessage() {
//        System.out.printf("进入方法");
        messageService.queryMessage();
    }
}
