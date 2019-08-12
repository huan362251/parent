package com.parents.message.entry;

import com.parents.common.ResponseDTO;
import com.parents.message.BigDataDTO;
import lombok.Data;

import java.util.List;

public class QueryMessageResDTO extends ResponseDTO {

    private List<BigDataDTO> bigDatas;

    public List<BigDataDTO> getBigDatas() {
        return bigDatas;
    }

    public void setBigDatas(List<BigDataDTO> bigDatas) {
        this.bigDatas = bigDatas;
    }
}
