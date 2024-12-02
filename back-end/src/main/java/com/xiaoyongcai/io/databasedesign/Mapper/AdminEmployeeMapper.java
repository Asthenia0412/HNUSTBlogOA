package com.xiaoyongcai.io.databasedesign.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaoyongcai.io.databasedesign.Pojo.Entity.ObjectPerson;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminEmployeeMapper extends BaseMapper<ObjectPerson> {

}
