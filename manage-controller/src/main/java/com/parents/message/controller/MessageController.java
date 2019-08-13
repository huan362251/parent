package com.parents.message.controller;

import com.parents.common.ResponseDTO;
import com.parents.message.BigDataDTO;
import com.parents.message.entry.QueryMessageResDTO;
import com.parents.message.entry.QueryMessageSingReqDTO;
import com.parents.message.entry.QueryMessageSingResDTO;
import com.parents.message.service.MessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

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
    @ApiOperation(value = "查询消息列表接口", notes = "查询消息列表接口", httpMethod = "POST")
    public QueryMessageResDTO queryMessage() {
        QueryMessageResDTO responseDTO = new QueryMessageResDTO();

        List<BigDataDTO> bigDataDTOS = messageService.queryMessage();

        responseDTO.setBigDatas(bigDataDTOS);

        return responseDTO;
    }

    @PostMapping("/queryMessageById.do")
    @ApiOperation(value = "通过id查询消息接口", notes = "通过id查询消息接口", httpMethod = "POST")
    public QueryMessageSingResDTO queryMessageById(@RequestBody QueryMessageSingReqDTO dto){
        QueryMessageSingResDTO responseDTO = new QueryMessageSingResDTO();
        BigDataDTO bigDataDTO = messageService.queryMessageByid(dto.getId());
        responseDTO.setBigDataDTO(bigDataDTO);
        return responseDTO;
    }

    @PostMapping("/insertMessage.do")
    @ApiOperation(value = "新增消息接口", notes = "新增消息接口", httpMethod = "POST")
    public ResponseDTO insertMessage(@RequestBody BigDataDTO dto){
        ResponseDTO responseDTO = new ResponseDTO();
        messageService.insertMessage(dto);
        return responseDTO;
    }

    @PostMapping("/updateMessage.do")
    @ApiOperation(value = "更新消息接口", notes = "更新消息接口", httpMethod = "POST")
    public ResponseDTO updateMessage(@RequestBody BigDataDTO dto){
        ResponseDTO responseDTO = new ResponseDTO();
        messageService.updateMessage(dto);
        return responseDTO;
    }

    @PostMapping("/deleteMessage.do")
    @ApiOperation(value = "删除消息接口", notes = "删除消息接口", httpMethod = "POST")
    public ResponseDTO deleteMessage(@RequestBody BigDataDTO dto){
        ResponseDTO responseDTO = new ResponseDTO();
        messageService.deleteMessage(dto.getId());
        System.out.println("测试1.0.3分支");
        System.out.println("测试1.0.4分支");
        System.out.println("测试1.0.4分支");
        System.out.println("测试1.0.4分支");
        return responseDTO;
    }

}
