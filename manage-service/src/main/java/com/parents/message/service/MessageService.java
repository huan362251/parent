package com.parents.message.service;

import com.parents.common.ResponseDTO;
import com.parents.message.BigDataDTO;

import java.util.List;

/**
 * @Author LIUHUAN
 * @Description
 * @Date Created by  2019/5/4 16:33
 **/
public interface MessageService {

    /**
     * 查询消息列表
     * @return
     */
    List<BigDataDTO> queryMessage();

    /**
     * 查询单个消息
     */
    BigDataDTO queryMessageByid(String id);

    /**
     * 新增一个消息
     * @param dto
     */
    ResponseDTO insertMessage(BigDataDTO dto);

    /**
     * 更新一个消息
     * @param dto
     */
    ResponseDTO updateMessage(BigDataDTO dto);

    /**
     * 删除一个消息
     * @param id
     */
    ResponseDTO deleteMessage(String id);
}
