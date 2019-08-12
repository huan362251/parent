package com.parents.message.service.impl;

import com.parents.common.ResponseDTO;
import com.parents.message.BigDataDTO;

import com.parents.message.dao.MessageDao;
import com.parents.message.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author LIUHUAN
 * @Description
 * @Date Created by  2019/5/4 16:34
 **/
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDao messageDao;

    /**
     * 查询消息列表
     * @return
     */
    @Override
    public List<BigDataDTO> queryMessage() {
        List<BigDataDTO> ad = messageDao.queryMessage();

        return ad;
    }

    @Override
    public BigDataDTO queryMessageByid(String id) {
        return messageDao.queryMessageByid(id);
    }

    @Override
    public ResponseDTO insertMessage(BigDataDTO dto) {
        ResponseDTO responseDTO = new ResponseDTO();

        messageDao.insertMessage(dto);

        return responseDTO;
    }

    @Override
    public ResponseDTO updateMessage(BigDataDTO dto) {

        ResponseDTO responseDTO = new ResponseDTO();

        messageDao.updateMessage(dto);

        return responseDTO;
    }

    @Override
    public ResponseDTO deleteMessage(String id) {
        ResponseDTO responseDTO = new ResponseDTO();

        messageDao.deleteMessage(id);

        return responseDTO;
    }
}
