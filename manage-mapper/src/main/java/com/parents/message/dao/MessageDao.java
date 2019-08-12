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
     * @return
     */
    List<BigDataDTO> queryMessage();

    /**
     *查询单个消息
     */
    BigDataDTO queryMessageByid(String id);

    /**
     * 新增一个消息
     * @param dto
     */
    void insertMessage(BigDataDTO dto);

    /**
     * 更新一个消息
     * @param dto
     */
    void updateMessage(BigDataDTO dto);

    /**
     * 删除一个消息
     * @param id
     */
    void deleteMessage(String id);
}
