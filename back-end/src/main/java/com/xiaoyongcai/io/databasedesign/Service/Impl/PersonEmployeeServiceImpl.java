package com.xiaoyongcai.io.databasedesign.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoyongcai.io.databasedesign.Mapper.PersonEmployeeMapper;
import com.xiaoyongcai.io.databasedesign.Mapper.RelationPersonnelMapper;
import com.xiaoyongcai.io.databasedesign.Pojo.DTO.ObjectPersonDTO;
import com.xiaoyongcai.io.databasedesign.Pojo.Entity.ObjectPerson;
import com.xiaoyongcai.io.databasedesign.Pojo.Entity.RelationPersonnel;
import com.xiaoyongcai.io.databasedesign.Service.PersonEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonEmployeeServiceImpl extends ServiceImpl<PersonEmployeeMapper, ObjectPerson> implements PersonEmployeeService {

    @Autowired
    private RelationPersonnelMapper relationPersonnelMapper;

    @Override
    public ObjectPersonDTO getEmployeeInfoById(int id) {
        ObjectPerson employee = this.getById(id);
        if (employee == null) {
            return null;
        }
        return convertToDTO(employee);
    }

    @Override
    public boolean updateEmployeeInfo(int id, ObjectPersonDTO objectPersonDTO){
        ObjectPerson employee = this.getById(id);
        // 确保 ID 被设置
        if (objectPersonDTO.getId() != null) {
            employee.setId(objectPersonDTO.getId());
        }

        // 更新其他字段（如果有）
        if (objectPersonDTO.getName() != null) {
            employee.setName(objectPersonDTO.getName());
        }
        if (objectPersonDTO.getSex() != null) {
            employee.setSex(objectPersonDTO.getSex());
        }
        if (objectPersonDTO.getBirthday() != null) {
            employee.setBirthday(objectPersonDTO.getBirthday());
        }
        if (objectPersonDTO.getDepartment() != null) {
            employee.setDepartment(objectPersonDTO.getDepartment());
        }
        if (objectPersonDTO.getJob() != null) {
            employee.setJob(objectPersonDTO.getJob());
        }
        if (objectPersonDTO.getEduLevel() != null) {
            employee.setEduLevel(objectPersonDTO.getEduLevel());
        }
        if (objectPersonDTO.getSpecialty() != null) {
            employee.setSpecialty(objectPersonDTO.getSpecialty());
        }
        if (objectPersonDTO.getAddress() != null) {
            employee.setAddress(objectPersonDTO.getAddress());
        }
        if (objectPersonDTO.getTel() != null) {
            employee.setTel(objectPersonDTO.getTel());
        }
        if (objectPersonDTO.getEmail() != null) {
            employee.setEmail(objectPersonDTO.getEmail());
        }
        if (objectPersonDTO.getState() != null) {
            employee.setState(objectPersonDTO.getState());
        }
        if (objectPersonDTO.getRemark() != null) {
            employee.setRemark(objectPersonDTO.getRemark());
        }
        if (objectPersonDTO.getPasswd() != null) {
            employee.setPasswd(objectPersonDTO.getPasswd());
        }
        if (objectPersonDTO.getAuthority() != null) {
            employee.setAuthority(objectPersonDTO.getAuthority());
        }

        // 更新数据
        return this.updateById(employee);
    }


    @Override
    public boolean changePassword(int id, String oldPassword, String newPassword) {
        ObjectPerson employee = this.getById(id);
        if (employee == null || !employee.getPasswd().equals(oldPassword)) {
            return false;
        }
        employee.setPasswd(newPassword);
        return this.updateById(employee);
    }

    @Override
    public List<ObjectPersonDTO> getEmployeesByDepartment(String department) {
        List<ObjectPerson> employees = this.lambdaQuery()
                .eq(ObjectPerson::getDepartment, department)
                .list();
        return employees.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public String getEmployeeStatus(int id) {
        ObjectPerson employee = this.getById(id);
        return (employee != null) ? employee.getState() : "未知";
    }

    @Override
    public List<RelationPersonnel> getEmployeeHistory(int id) {
        LambdaQueryWrapper<RelationPersonnel> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(RelationPersonnel::getId, id);
        return relationPersonnelMapper.selectList(queryWrapper);
    }

    @Override
    public ObjectPerson login(String name, String passwd) {
        QueryWrapper<ObjectPerson> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("NAME", name).eq("PASSWD", passwd);
        return this.list(queryWrapper).stream().findFirst().orElse(null);
    }

    /**
     * 将 ObjectPerson 实体对象转换为 ObjectPersonDTO 对象
     *
     * @param objectPerson 实体对象
     * @return DTO 对象
     */
    public ObjectPersonDTO convertToDTO(ObjectPerson objectPerson) {
        if (objectPerson == null) {
            return null;
        }
        // 创建 DTO 对象并设置属性
        ObjectPersonDTO dto = new ObjectPersonDTO();
        dto.setId(objectPerson.getId());
        dto.setName(objectPerson.getName());
        dto.setSex(objectPerson.getSex());
        dto.setPasswd(objectPerson.getPasswd());
        dto.setAuthority(objectPerson.getAuthority());
        dto.setBirthday(objectPerson.getBirthday());
        dto.setDepartment(objectPerson.getDepartment());
        dto.setJob(objectPerson.getJob());
        dto.setEduLevel(objectPerson.getEduLevel());
        dto.setSpecialty(objectPerson.getSpecialty());
        dto.setAddress(objectPerson.getAddress());
        dto.setTel(objectPerson.getTel());
        dto.setEmail(objectPerson.getEmail());
        dto.setState(objectPerson.getState());
        dto.setRemark(objectPerson.getRemark());
        return dto;
    }

    /**
     * 将 ObjectPersonDTO 对象转换为 ObjectPerson 实体对象
     *
     * @param objectPersonDTO DTO 对象
     * @return 实体对象
     */
    public static ObjectPerson toEntity(ObjectPersonDTO objectPersonDTO) {
        if (objectPersonDTO == null) {
            return null;
        }
        // 创建实体对象并设置属性
        ObjectPerson entity = new ObjectPerson();
        entity.setId(objectPersonDTO.getId());
        entity.setName(objectPersonDTO.getName());
        entity.setSex(objectPersonDTO.getSex());
        entity.setPasswd(objectPersonDTO.getPasswd());
        entity.setAuthority(objectPersonDTO.getAuthority());
        entity.setBirthday(objectPersonDTO.getBirthday());
        entity.setDepartment(objectPersonDTO.getDepartment());
        entity.setJob(objectPersonDTO.getJob());
        entity.setEduLevel(objectPersonDTO.getEduLevel());
        entity.setSpecialty(objectPersonDTO.getSpecialty());
        entity.setAddress(objectPersonDTO.getAddress());
        entity.setTel(objectPersonDTO.getTel());
        entity.setEmail(objectPersonDTO.getEmail());
        entity.setState(objectPersonDTO.getState());
        entity.setRemark(objectPersonDTO.getRemark());
        return entity;
    }
}
