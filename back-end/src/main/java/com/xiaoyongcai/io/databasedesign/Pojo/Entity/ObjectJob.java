package com.xiaoyongcai.io.databasedesign.Pojo.Entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("Object_Job")
public class ObjectJob {

    // 主键
    @TableId(value = "CODE")
    private Integer code;
    @TableField("DESCRIPTION")  // 显式指定数据库列名为 DESCRIPTION
    private String description;

}
