package com.xiaoyongcai.io.databasedesign.Service.Impl;

import com.xiaoyongcai.io.databasedesign.Pojo.Entity.Blog;
import com.xiaoyongcai.io.databasedesign.Pojo.ResquestAndResponse.BlogRequest;
import com.xiaoyongcai.io.databasedesign.Pojo.ResquestAndResponse.BlogResponse;
import com.xiaoyongcai.io.databasedesign.Mapper.BlogMapper;
import com.xiaoyongcai.io.databasedesign.Service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    // 发布博客文章
    @Override
    public boolean publishBlog(BlogRequest blogRequest) {
        Blog blog = new Blog();
        blog.setTitle(blogRequest.getTitle());
        blog.setContent(blogRequest.getContent());
        blog.setAuthor(blogRequest.getAuthor());
        blog.setCategory(blogRequest.getCategory());
        blog.setIsPublished(blogRequest.getIsPublished());
        blog.setCreationTime(Timestamp.valueOf(LocalDateTime.now()));

        // 插入数据库
        return blogMapper.insert(blog) > 0;
    }

    // 获取所有博客文章
    @Override
    public List<BlogResponse> getAllBlogs() {
        List<Blog> blogs = blogMapper.selectList(null);  // 获取所有博客记录

        return blogs.stream().map(blog -> {
            BlogResponse response = new BlogResponse();
            response.setId(String.valueOf(blog.getId()));
            response.setTitle(blog.getTitle());
            response.setContent(blog.getContent());
            response.setContentPreview(blog.getContent().length() > 100 ? blog.getContent().substring(0, 100) + "..." : blog.getContent());
            response.setSuccess(true);
            response.setMessage("成功获取所有博客");
            response.setCreationTime(blog.getCreationTime().toString());
            return response;
        }).collect(Collectors.toList());
    }
}
