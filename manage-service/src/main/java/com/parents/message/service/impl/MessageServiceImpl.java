package com.parents.message.service.impl;

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

    @Override
    public String queryMessage() {
        List<BigDataDTO> ad = messageDao.queryMessage("ad");
        for (BigDataDTO dto : ad) {
            dto.toString();
        }
        return "获取查询消息";
    }
}
