package com.xiaoyongcai.io.databasedesign.Pojo.Entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.IdType;
import lombok.Data;

@TableName("Object_Department")  // 映射到数据库表
@Data
public class ObjectDepartment {

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;  // 对应数据库中的 "ID" 列

    @TableField("NAME")  // 显式指定数据库列名
    private String name;  // 对应数据库中的 "NAME" 列

    @TableField("MANAGER")  // 显式指定数据库列名
    private String manager;  // 对应数据库中的 "MANAGER" 列

    @TableField("INTRO")  // 显式指定数据库列名
    private String intro;  // 对应数据库中的 "INTRO" 列
}
