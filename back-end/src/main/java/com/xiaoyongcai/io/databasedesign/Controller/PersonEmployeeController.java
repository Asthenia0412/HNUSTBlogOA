package com.xiaoyongcai.io.databasedesign.Controller;

import com.xiaoyongcai.io.databasedesign.Pojo.DTO.ObjectPersonDTO;
import com.xiaoyongcai.io.databasedesign.Pojo.Entity.ObjectPerson;
import com.xiaoyongcai.io.databasedesign.Pojo.Entity.RelationPersonnel;
import com.xiaoyongcai.io.databasedesign.Pojo.ResquestAndResponse.LoginRequest;
import com.xiaoyongcai.io.databasedesign.Service.PersonEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User/employee")
public class PersonEmployeeController {

    @Autowired
    private PersonEmployeeService personEmployeeService;


    /**
     * 根据员工ID获取员工基本信息
     *
     * @param id 员工ID
     * @return 员工信息
     */
    @GetMapping("/{id}")
    public ObjectPersonDTO getEmployeeInfoById(@PathVariable("id") int id) {
        return personEmployeeService.getEmployeeInfoById(id);
    }

    /**
     * 修改员工基本信息
     *
     * @param id 员工ID
     * @param employee 员工信息对象
     * @return 操作结果
     */
    @PutMapping("/{id}")
    public boolean updateEmployeeInfo(@PathVariable("id") int id, @RequestBody ObjectPersonDTO employeeDTO) {

        return personEmployeeService.updateEmployeeInfo(id, employeeDTO);
    }

    /**
     * 修改员工密码
     *
     * @param id 员工ID
     * @param oldPassword 旧密码
     * @param newPassword 新密码
     * @return 操作结果
     */
    @PutMapping("/{id}/{oldPassword}/{newPassword}")
    public boolean changePassword(@PathVariable("id") int id,
                                  @PathVariable("oldPassword") String oldPassword,
                                  @PathVariable("newPassword") String newPassword) {
        return personEmployeeService.changePassword(id, oldPassword, newPassword);
    }

    /**
     * 查看指定部门的所有员工
     *
     * @param department 部门名称
     * @return 部门下所有员工
     */
    @GetMapping("/department")
    public List<ObjectPersonDTO> getEmployeesByDepartment(@RequestParam("department") String department) {
        return personEmployeeService.getEmployeesByDepartment(department);
    }

    /**
     * 获取员工当前在职状态
     *
     * @param id 员工ID
     * @return 员工在职状态
     */
    @GetMapping("/status/{id}")
    public String getEmployeeStatus(@PathVariable("id") int id) {
        return personEmployeeService.getEmployeeStatus(id);
    }

    /**
     * 获取员工的历史记录
     *
     * @param id 员工ID
     * @return 员工历史记录
     */
    @GetMapping("/{id}/history")
    public List<RelationPersonnel> getEmployeeHistory(@PathVariable("id") int id) {
        return personEmployeeService.getEmployeeHistory(id);
    }

    @PostMapping("/login")
    public ObjectPerson login(@RequestBody LoginRequest loginRequest) {
        String NAME = loginRequest.getName();
        String PASSWD = loginRequest.getPasswd();
        ObjectPerson user = personEmployeeService.login(NAME, PASSWD);
        if (user != null) {
            return user; // 登录成功，返回用户信息
        } else {
            return null; // 登录失败
        }
        }
}
