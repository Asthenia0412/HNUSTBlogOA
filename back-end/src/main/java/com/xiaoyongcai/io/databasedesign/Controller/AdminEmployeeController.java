package com.xiaoyongcai.io.databasedesign.Controller;

import com.xiaoyongcai.io.databasedesign.Pojo.DTO.ObjectPersonDTO;
import com.xiaoyongcai.io.databasedesign.Pojo.ResquestAndResponse.DeleteRequest;
import com.xiaoyongcai.io.databasedesign.Pojo.Entity.ObjectPerson;
import com.xiaoyongcai.io.databasedesign.Service.AdminEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Admin/employee")
public class AdminEmployeeController {

    @Autowired
    private AdminEmployeeService adminEmployeeService;

    // 获取员工列表 (包含分页和排序)
    @GetMapping("/list")
    public List<ObjectPerson> getAllEmployees(@RequestParam(value = "page", defaultValue = "1") int page,
                                              @RequestParam(value = "size", defaultValue = "10") int size,
                                              @RequestParam(value = "sort", defaultValue = "id") String sort) {
        // Your pagination and sorting logic can be added here
        return adminEmployeeService.selectAllObjectPerson();
    }

    // 新增员工
    @PostMapping("/add")
    public boolean addEmployee(@RequestBody ObjectPersonDTO objectPersonDTO) {
        return adminEmployeeService.insertObjectPerson(objectPersonDTO);
    }

    // 修改员工信息
    @PostMapping("/update")
    public boolean updateEmployee(@RequestBody ObjectPersonDTO objectPersonDTO) {
        return adminEmployeeService.updateObjectPerson(objectPersonDTO.getId(), objectPersonDTO);
    }

    // 删除员工
    @DeleteMapping("/delete")
    public boolean deleteEmployee(@RequestBody DeleteRequest deleteRequest) {
        return adminEmployeeService.deleteObjectPerson(deleteRequest.getId());
    }

    // 获取员工详细信息
    @GetMapping("/{id}")
    public ObjectPerson getEmployeeById(@PathVariable Integer id) {
        return adminEmployeeService.selectObjectPersonById(id);
    }

    // 员工状态变更
    @PostMapping("/status")
    public boolean updateEmployeeStatus(@RequestBody ObjectPersonDTO objectPersonDTO) {
        return adminEmployeeService.updateObjectPersonStatus(objectPersonDTO.getId(), objectPersonDTO.getState());
    }
}
