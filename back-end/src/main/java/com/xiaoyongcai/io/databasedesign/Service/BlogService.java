package com.xiaoyongcai.io.databasedesign.Service;

import com.xiaoyongcai.io.databasedesign.Pojo.ResquestAndResponse.BlogRequest;
import com.xiaoyongcai.io.databasedesign.Pojo.ResquestAndResponse.BlogResponse;

import java.util.List;

public interface BlogService {
     boolean publishBlog(BlogRequest blogRequest);
    List<BlogResponse> getAllBlogs() ;}
