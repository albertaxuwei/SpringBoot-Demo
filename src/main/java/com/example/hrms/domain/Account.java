package com.example.hrms.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tbl_account")
public class Account {
    private Integer id;
    private String username;
    private String password;
    private String other;
}
