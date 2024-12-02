package com.xiaoyongcai.io.databasedesign.Pojo.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@TableName("blog")  // 指定对应的数据库表名
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Blog {

    @TableId(value = "id", type = IdType.AUTO)  // 指定id为自增主键
    private Long id;  // 博客的唯一标识

    @TableField("title")
    private String title;  // 博客标题

    @TableField("content")
    private String content;  // 博客内容

    @TableField("author")
    private String author;  // 博客作者

    @TableField("category")
    private String category;  // 博客分类（可选）

    @TableField("is_published")
    private Boolean isPublished = false;  // 是否发布，默认为未发布

    @TableField("creation_time")
    private Timestamp creationTime;  // 创建时间
}
