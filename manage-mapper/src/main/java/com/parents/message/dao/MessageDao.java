package com.parents.message.dao;

import com.parents.message.BigDataDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author LIUHUAN
 * @Description
 * @Date Created by  2019/5/4 16:50
 **/
@Mapper
public interface MessageDao {

    /**
     * 查询消息列表
     *
     * @param id 消息主键
     * @return
     */
    List<BigDataDTO> queryMessage(String id);
}
