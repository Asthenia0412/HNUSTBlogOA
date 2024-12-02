package com.xiaoyongcai.io.databasedesign.Pojo.Entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("Object_PersonnelChange")  // 表示对应数据库中的表
@Data  // Lombok 提供的注解，用于自动生成 getter、setter、toString 等方法
public class ObjectPersonnelChange {

    @TableId(value = "CODE")  // 设置 CODE 字段为主键
    private String code;  // 变更代码，作为每种变更类型的唯一标识符

    @TableField("DESCRIPTION")  // 显式指定数据库列名为 DESCRIPTION
    private String description;  // 变更类型的描述，用于简要说明变更的内容
}
