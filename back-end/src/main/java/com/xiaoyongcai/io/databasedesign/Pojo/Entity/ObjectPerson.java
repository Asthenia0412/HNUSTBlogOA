package com.xiaoyongcai.io.databasedesign.Pojo.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("Object_Person") // 映射到数据库表 Object_Person
public class ObjectPerson {

    // 主键自增
    @TableId(value = "ID", type = IdType.AUTO) // 映射到数据库中的 ID 列
    private Integer id;

    @TableField("PASSWD") // 映射到数据库中的 PASSWD 列
    private String passwd;

    @TableField("AUTHORITY") // 映射到数据库中的 AUTHORITY 列
    private String authority;

    @TableField("NAME") // 映射到数据库中的 NAME 列
    private String name;

    @TableField("SEX") // 映射到数据库中的 SEX 列
    private String sex;

    @TableField("BIRTHDAY") // 映射到数据库中的 BIRTHDAY 列
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @TableField("DEPARTMENT") // 映射到数据库中的 DEPARTMENT 列
    private String department;

    @TableField("JOB") // 映射到数据库中的 JOB 列
    private String job;

    @TableField("EDU_LEVEL") // 映射到数据库中的 EDU_LEVEL 列
    private String eduLevel;

    @TableField("SPCIALTY") // 映射到数据库中的 SPCIALTY 列
    private String specialty;

    @TableField("ADDRESS") // 映射到数据库中的 ADDRESS 列
    private String address;

    @TableField("TEL") // 映射到数据库中的 TEL 列
    private String tel;

    @TableField("EMAIL") // 映射到数据库中的 EMAIL 列
    private String email;

    @TableField("STATE") // 映射到数据库中的 STATE 列
    private String state;

    @TableField("REMARK") // 映射到数据库中的 REMARK 列
    private String remark;
}
