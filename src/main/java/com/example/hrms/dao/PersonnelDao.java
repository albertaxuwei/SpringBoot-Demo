package com.example.hrms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.hrms.domain.Personnel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonnelDao extends BaseMapper<Personnel> {

}
