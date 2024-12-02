package com.xiaoyongcai.io.databasedesign.Pojo.DTO;

import lombok.Data;

@Data
public class ObjectEduLevelDTO {

    private Integer code;       // 教育等级代码
    private String description; // 教育等级描述

    // 如果需要，可以添加构造函数，或者其他逻辑
    public ObjectEduLevelDTO(Integer code, String description) {
        this.code = code;
        this.description = description;
    }
}
