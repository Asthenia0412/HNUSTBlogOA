package com.xiaoyongcai.io.databasedesign.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaoyongcai.io.databasedesign.Pojo.Entity.Blog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogMapper extends BaseMapper<Blog> {
    // 你可以在这里定义更多的查询方法
}
