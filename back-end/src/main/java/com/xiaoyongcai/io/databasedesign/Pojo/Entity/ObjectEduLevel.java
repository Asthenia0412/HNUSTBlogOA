package com.xiaoyongcai.io.databasedesign.Pojo.Entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("Object_EduLevel")  // 映射到数据库表 Object_EduLevel
public class ObjectEduLevel {

    // 主键
    @TableId(value = "CODE")  // 显式指定数据库字段名
    private Integer code;

    // 显式指定数据库字段名
    @TableField("DESCRIPTION")  // 显式指定数据库列名为 DESCRIPTION
    private String description;

}
