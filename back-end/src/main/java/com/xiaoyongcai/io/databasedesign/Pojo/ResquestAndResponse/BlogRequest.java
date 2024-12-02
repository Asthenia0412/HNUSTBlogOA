package com.xiaoyongcai.io.databasedesign.Pojo.ResquestAndResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogRequest {

    private String title;  // 博客标题

    private String content;  // 博客内容

    private String author;  // 博客作者

    private String category;  // 博客分类（可选）

    private Boolean isPublished;  // 是否发布
}
