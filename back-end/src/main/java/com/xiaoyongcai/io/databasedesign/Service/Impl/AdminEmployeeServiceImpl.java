package com.xiaoyongcai.io.databasedesign.Service.Impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoyongcai.io.databasedesign.Mapper.AdminEmployeeMapper;
import com.xiaoyongcai.io.databasedesign.Pojo.DTO.ObjectPersonDTO;
import com.xiaoyongcai.io.databasedesign.Pojo.Entity.ObjectPerson;
import com.xiaoyongcai.io.databasedesign.Service.AdminEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminEmployeeServiceImpl extends ServiceImpl<AdminEmployeeMapper,ObjectPerson> implements AdminEmployeeService {

    @Autowired
    private AdminEmployeeMapper AdminEmployeeMapper;

    @Override
    public List<ObjectPerson> selectAllObjectPerson() {
        // 使用MyBatis-Plus的query方法直接查询所有记录
        return AdminEmployeeMapper.selectList(null);
    }



    @Override
    public boolean insertObjectPerson(ObjectPersonDTO ObjectPersonDTO) {
        // 将DTO转换为Entity对象进行插入
        ObjectPerson objectPerson = new ObjectPerson();
        objectPerson.setName(ObjectPersonDTO.getName());
        objectPerson.setPasswd(ObjectPersonDTO.getPasswd());
        objectPerson.setAuthority(ObjectPersonDTO.getAuthority());
        objectPerson.setSex(ObjectPersonDTO.getSex());
        objectPerson.setBirthday(ObjectPersonDTO.getBirthday());
        objectPerson.setDepartment(ObjectPersonDTO.getDepartment());
        objectPerson.setJob(ObjectPersonDTO.getJob());
        objectPerson.setEduLevel(ObjectPersonDTO.getEduLevel());
        objectPerson.setSpecialty(ObjectPersonDTO.getSpecialty());
        objectPerson.setAddress(ObjectPersonDTO.getAddress());
        objectPerson.setTel(ObjectPersonDTO.getTel());
        objectPerson.setEmail(ObjectPersonDTO.getEmail());
        objectPerson.setState(ObjectPersonDTO.getState());
        objectPerson.setRemark(ObjectPersonDTO.getRemark());

        // 插入对象
        return AdminEmployeeMapper.insert(objectPerson) > 0;
    }

    @Override
    public boolean updateObjectPerson(Integer id, ObjectPersonDTO objectPersonDTO) {
        // 根据ID查询对象
        ObjectPerson objectPerson = AdminEmployeeMapper.selectById(id);
        if (objectPerson != null) {
            // 根据DTO的值更新对象
            objectPerson.setId(objectPersonDTO.getId());          // 更新ID
            objectPerson.setPasswd(objectPersonDTO.getPasswd());  // 更新密码
            objectPerson.setAuthority(objectPersonDTO.getAuthority()); // 更新权限
            objectPerson.setName(objectPersonDTO.getName());      // 更新姓名
            objectPerson.setSex(objectPersonDTO.getSex());        // 更新性别
            objectPerson.setBirthday(objectPersonDTO.getBirthday()); // 更新生日
            objectPerson.setDepartment(objectPersonDTO.getDepartment()); // 更新部门
            objectPerson.setJob(objectPersonDTO.getJob());        // 更新职位
            objectPerson.setEduLevel(objectPersonDTO.getEduLevel()); // 更新学历
            objectPerson.setSpecialty(objectPersonDTO.getSpecialty()); // 更新专业
            objectPerson.setAddress(objectPersonDTO.getAddress()); // 更新地址
            objectPerson.setTel(objectPersonDTO.getTel());        // 更新电话
            objectPerson.setEmail(objectPersonDTO.getEmail());    // 更新邮箱
            objectPerson.setState(objectPersonDTO.getState());    // 更新状态
            objectPerson.setRemark(objectPersonDTO.getRemark());  // 更新备注

            // 更新对象
            return AdminEmployeeMapper.updateById(objectPerson) > 0;
        }
        return false;
    }


    @Override
    public boolean deleteObjectPerson(Integer id) {
        // 根据ID删除对象
        return AdminEmployeeMapper.deleteById(id) > 0;
    }

    @Override
    public ObjectPerson selectObjectPersonById(Integer id) {
        // 根据ID查询对象
        return AdminEmployeeMapper.selectById(id);
    }

    @Override
    public boolean updateObjectPersonStatus(Integer id, String status) {
        // 使用MyBatis-Plus的更新方法来更新状态
        ObjectPerson objectPerson = new ObjectPerson();
        objectPerson.setId(id);
        objectPerson.setState(status);
        return AdminEmployeeMapper.updateById(objectPerson) > 0;
    }


}
