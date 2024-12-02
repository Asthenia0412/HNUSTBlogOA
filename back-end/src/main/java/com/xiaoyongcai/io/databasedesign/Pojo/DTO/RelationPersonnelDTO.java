package com.xiaoyongcai.io.databasedesign.Pojo.DTO;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
public class RelationPersonnelDTO {

    private Long id;           // 记录编号
    private String person;     // 员工号
    private String change;     // 变更代码
    private String description; // 变更描述
}
