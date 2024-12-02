package com.xiaoyongcai.io.databasedesign.Pojo.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ObjectPersonDTO {

    private Integer id;          // 主键 ID
    private String name;         // 姓名
    private String sex;          // 性别
    private String Passwd;
    private String authority;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;       // 出生日期
    private String department;   // 部门
    private String job;          // 职位
    private String eduLevel;     // 教育程度
    private String specialty;    // 专业
    private String address;      // 地址
    private String tel;          // 电话
    private String email;        // 邮箱
    private String state;        // 状态
    private String remark;       // 备注
}
