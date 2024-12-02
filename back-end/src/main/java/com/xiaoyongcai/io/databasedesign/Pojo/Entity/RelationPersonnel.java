package com.xiaoyongcai.io.databasedesign.Pojo.Entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@TableName("Relation_Personnel")  // 表示对应数据库中的表
@Data  // Lombok 提供的注解，用于自动生成 getter、setter、toString 等方法
public class RelationPersonnel {

    @TableId(value = "ID")  // 设置 ID 字段为主键
    private Long id;  // 记录编号，主键，自增字段

    @TableField(value = "PERSON")
    private String person;  // 员工号，不能为空，用于标识该条记录所属的员工

    @TableField(value = "Change_")
    private String change;  // 变更代码，不能为空，表示记录的变更类型

    @TableField(value = "DESCRIPTION")
    private String description;  // 详细记录，不能为空，用于存储变更的具体描述信息
}
