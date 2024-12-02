package com.xiaoyongcai.io.databasedesign.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoyongcai.io.databasedesign.Pojo.DTO.ObjectPersonDTO;
import com.xiaoyongcai.io.databasedesign.Pojo.Entity.ObjectPerson;

import java.util.List;

public interface AdminEmployeeService extends IService<ObjectPerson> {

    //获取员工列表
    List<ObjectPerson> selectAllObjectPerson();

    //新增员工
    boolean insertObjectPerson(ObjectPersonDTO objectPerson);

    //修改员工信息
    boolean updateObjectPerson(Integer id, ObjectPersonDTO objectPerson);

    //删除员工
    boolean deleteObjectPerson(Integer id);

    //获取员工详细信息
    ObjectPerson selectObjectPersonById(Integer id);

    //员工状态变更
    boolean updateObjectPersonStatus(Integer id,String status);

}
