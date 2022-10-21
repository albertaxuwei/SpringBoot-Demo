package com.example.hrms.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tbl_personnel")
public class Personnel {
    private  Integer id ;
    private  String type ;
    private  String name ;
    private  String description ;
}
