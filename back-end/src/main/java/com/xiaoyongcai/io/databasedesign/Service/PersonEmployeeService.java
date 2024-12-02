package com.xiaoyongcai.io.databasedesign.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoyongcai.io.databasedesign.Pojo.DTO.ObjectPersonDTO;
import com.xiaoyongcai.io.databasedesign.Pojo.Entity.ObjectPerson;
import com.xiaoyongcai.io.databasedesign.Pojo.Entity.RelationPersonnel;

import java.util.List;

public interface PersonEmployeeService extends IService<ObjectPerson> {
    /**
     * 根据员工ID获取员工基本信息
     *
     * @param id 员工ID
     * @return 员工信息
     */
    ObjectPersonDTO getEmployeeInfoById(int id);

    /**
     * 修改员工基本信息
     *
     * @param id 传入的值
     * @param ObjectPersonDTO 员工信息对象
     * @return 操作结果
     */
    boolean updateEmployeeInfo(int id, ObjectPersonDTO employee);

    /**
     * 修改员工密码
     *
     * @param id 员工ID
     * @param oldPassword 旧密码
     * @param newPassword 新密码
     * @return 操作结果
     */
    boolean changePassword(int id, String oldPassword, String newPassword);

    /**
     * 根据部门获取该部门的所有员工
     *
     * @param department 部门名称
     * @return 部门下所有员工
     */
    List<ObjectPersonDTO> getEmployeesByDepartment(String department);

    /**
     * 获取员工当前在职状态
     *
     * @param id 员工ID
     * @return 员工在职状态
     */
    String getEmployeeStatus(int id);

    /**
     * 获取员工的历史记录
     *
     * @param id 员工ID
     * @return 员工历史记录
     */
    List<RelationPersonnel> getEmployeeHistory(int id);

    ObjectPerson login(String name, String passwd);
}
