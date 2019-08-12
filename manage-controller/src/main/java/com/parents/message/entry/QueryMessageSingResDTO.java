package com.parents.message.entry;

import com.parents.common.ResponseDTO;
import com.parents.message.BigDataDTO;

public class QueryMessageSingResDTO extends ResponseDTO {

    private BigDataDTO bigDataDTO;

    public BigDataDTO getBigDataDTO() {
        return bigDataDTO;
    }

    public void setBigDataDTO(BigDataDTO bigDataDTO) {
        this.bigDataDTO = bigDataDTO;
    }
}
