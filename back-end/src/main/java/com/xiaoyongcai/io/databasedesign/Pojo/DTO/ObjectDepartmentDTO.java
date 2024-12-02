package com.xiaoyongcai.io.databasedesign.Pojo.DTO;

import lombok.Data;

@Data
public class ObjectDepartmentDTO {
    private Integer id;        // 部门 ID
    private String name;       // 部门名称
    private String manager;    // 部门经理
    private String intro;      // 部门简介

    // 如果需要，可以添加构造函数，或者其他转换逻辑
    public ObjectDepartmentDTO(Integer id, String name, String manager, String intro) {
        this.id = id;
        this.name = name;
        this.manager = manager;
        this.intro = intro;
    }
}
