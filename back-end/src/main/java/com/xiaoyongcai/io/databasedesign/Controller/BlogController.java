package com.xiaoyongcai.io.databasedesign.Controller;

import com.xiaoyongcai.io.databasedesign.Pojo.ResquestAndResponse.BlogRequest;
import com.xiaoyongcai.io.databasedesign.Pojo.ResquestAndResponse.BlogResponse;
import com.xiaoyongcai.io.databasedesign.Service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Discuss")
public class BlogController {

    @Autowired
    private BlogService blogService;

    // 发布新的博客文章
    @PostMapping("/newPress")
    public String newPress(@RequestBody BlogRequest blogRequest) {
        boolean result = blogService.publishBlog(blogRequest);
        if (result) {
            return "博客发布成功!";
        } else {
            return "博客发布失败!";
        }
    }

    // 获取所有博客文章
    @GetMapping("/GetAll")
    public List<BlogResponse> getAll() {
        return blogService.getAllBlogs();
    }
}
